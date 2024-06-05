package accesoADatos;

import entidades.Entrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EntrenadorData {

    private Connection con = null;

    public EntrenadorData() {
        con = Conexion.getConexion();

    }

    public void guardarEntrenador(Entrenador entrenador) {
        try {
            String sql = "INSERT INTO entrenador(dni, apellido, nombre, especialidad, estado) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, entrenador.getDni());
            ps.setString(2, entrenador.getApellido());
            ps.setString(3, entrenador.getNombre());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());

            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                entrenador.setIdEntrenador(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Entrenador agregado con exito!");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Entrenador");
        }

    }

    public Entrenador buscarEntrenador(int id) {

        Entrenador entrenador = null;
        String sql = "SELECT dni, apellido, nombre, especialidad FROM entrenador WHERE  IdEntrenador = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                entrenador = new Entrenador();
                entrenador.setIdEntrenador(id);
                entrenador.setDni(resultado.getInt("dni"));
                entrenador.setApellido(resultado.getString("apellido"));
                entrenador.setNombre(resultado.getString("nombre"));
                entrenador.setEspecialidad(resultado.getString("especialidad"));
                entrenador.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Entrenador!");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla entrenador");
        }
        return entrenador;

    }

    public Entrenador buscarEntrenadorPorDni(int dni) {
        Entrenador entrenador = null;
        String sql = "SELECT IdEntrenador, dni, apellido, nombre, especialidad FROM entrenador WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                entrenador = new Entrenador();
                entrenador.setIdEntrenador(resultado.getInt("IdEntrenador"));
                entrenador.setDni(resultado.getInt("dni"));
                entrenador.setApellido(resultado.getString("apellido"));
                entrenador.setNombre(resultado.getString("nombre"));
                entrenador.setEspecialidad(resultado.getString("especialidad"));
                entrenador.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Entrenador");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
        }

        return entrenador;
    }

    public List<Entrenador> listarEntrenadores() {
        List<Entrenador> entrenadores = new ArrayList<>();
        String sql = "SELECT * FROM entrenador WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Entrenador entrenador = new Entrenador ();
                entrenador.setIdEntrenador(resultado.getInt("idEntrenador"));
                entrenador.setDni(resultado.getInt("dni"));
                entrenador.setApellido(resultado.getString("apellido"));
                entrenador.setNombre(resultado.getString("nombre"));
                entrenador.setEspecialidad(resultado.getString("especialidad"));
                entrenador.setEstado(resultado.getBoolean("estado"));
                entrenadores.add(entrenador);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador ");
        }
        return entrenadores;

    }

    public void modificarEntrenador(Entrenador entrenador) {
        String sql = "UPDATE entrenador SET dni = ? , apellido = ? , nombre = ? , especialidad = ? WHERE IdEntrenador = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, entrenador.getDni());
            ps.setString(2, entrenador.getApellido());
            ps.setString(3, entrenador.getNombre());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setInt(5, entrenador.getIdEntrenador());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Entrenador modificado correctamente ");
            } else {

                JOptionPane.showMessageDialog(null, " Entrenador no encontrado ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador ");
        }

    }

    public void eliminarEntrenador(int id) {
        String sql = "UPDATE Entrenador SET estado = 0 WHERE idEntrenador = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Entrenador Eliminado correctamente ");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Entrenador ");

        }

    }
}
