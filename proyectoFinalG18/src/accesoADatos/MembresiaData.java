package accesoADatos;

import entidades.Membresia;
import entidades.Socio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MembresiaData {

    private Connection con = null;
    private SocioData sData = new SocioData();
    

    public MembresiaData() {

        con = Conexion.getConexion();

    }

    public void guardarMembresia(Membresia membresia) {

        String sql = "INSERT INTO membresia(CantidadPases,FechaInicio,FechaFin,Costo,Estado) Values( ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, membresia.getCantidadPases());
            ps.setDate(2, Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(3, Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(4, membresia.getCosto());
            ps.setBoolean(5, membresia.isEstado());

            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                membresia.setIdMembresia(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Membresia agregada con exito!");
            }
            ps.close();

        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia");
        }
    }

    public Membresia buscarMembresia(String dni) {// Listo y Probado 
        Membresia membresia = null;
        Socio socio= null;
        String sql = "SELECT s.nombre, s.apellido, m.cantidadPases, m.FechaFin FROM membresia m join socio s on (m.IdSocio= s.IdSocio)  WHERE m.estado = 1 and s.estado = 1 and s.dni = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                membresia = new Membresia();
                socio= new Socio(); 
                socio.setNombre(resultado.getString("nombre"));
                socio.setApellido(resultado.getString("apellido"));
                membresia.setCantidadPases(resultado.getInt("CantidadPases"));
                membresia.setFechaFin(resultado.getDate("FechaFin").toLocalDate());                 
                membresia.setSocio(socio);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la Membresia. ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Membresia. ");

        }
        return membresia;
    }

    public void modificarMembresia(Membresia membresia) {
        try {
            String sql = "UPDATE membresia SET IdSocio= ?, CantidadPases = ?, FechaInicio= ?, FechaFin= ?, Costo=?, estado= ? WHERE idMembresia= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, membresia.getSocio().getIdSocio());
            ps.setInt(2, membresia.getCantidadPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getCosto());
            ps.setBoolean(6, membresia.isEstado());
            ps.setInt(7, membresia.getIdMembresia());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Membresia modificada exitosamente. ");
            } else {

                JOptionPane.showMessageDialog(null, " Membresia no encontrada ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }

    }

    public void eliminarMembresia(int idMembresia) {
        try {
            String sql = "UPDATE membresia SET estado= 0 WHERE idMembresia = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMembresia);
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Membresia eliminada con exito. ");

            } else {
                JOptionPane.showMessageDialog(null, " Membresia no encontrada ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia");
        }
    }

    public List<Membresia> listarMembresias() {
        List<Membresia> membresias = new ArrayList<>();
        try {

            String sql = "SELECT * FROM membresia";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            
            while (resultado.next()) {
                Membresia membresia = new Membresia();
                Socio socio = new Socio();
                socio.setIdSocio(resultado.getInt("IdSocio"));
                membresia.setIdMembresia(resultado.getInt("IdMembresia"));
                membresia.setSocio(socio);
                membresia.setCantidadPases(resultado.getInt("cantidadaPases"));
                membresia.setFechaFin(resultado.getDate("FechaInicio").toLocalDate());
                membresia.setFechaFin(resultado.getDate("FechaFin").toLocalDate());
                membresia.setCosto(resultado.getDouble("costo"));
                membresia.setEstado(resultado.getBoolean("estado"));
                membresias.add(membresia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia");
        }
        return membresias;

    }

}
