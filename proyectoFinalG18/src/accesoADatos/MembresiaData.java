package accesoADatos;

import entidades.Membresia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MembresiaData {

    private Connection con = null;
    private SocioData sData = new SocioData();

    public MembresiaData() {

        con = Conexion.getConexion();

    }

    public void guardarMembresia(Membresia membresia) {

        String sql = "INSERT INTO membresia(IdSocio,CantidadPases,FechaInicio,FechaFin,Costo,Estado) Values( ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, membresia.getIdSocio());
            ps.setInt(2, membresia.getCantidadPases());
            //ps.setDate(3, membresia.getFechaInicio());
            //ps.setDate(4, membresia.getFechaFin());
            ps.setDouble(5, membresia.getCosto());
            ps.setBoolean(6, true);

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

    public Membresia buscarMembresia(int idMembresia) {
        Membresia membresia = null;
        String sql = "SELECT IdSocio, CantidadPases,FechaInicio, FechaFin, Costo, Estado FROM membresia WHERE IdMembresia = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMembresia);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(idMembresia);
                membresia.setIdSocio(resultado.getInt("IdSocio"));
                membresia.setCantidadPases(resultado.getInt("CantidadPases"));
                // membresia.setFechaInicio(resultado.getDate());
                // membresia.setFechaFin(resultado.getDate());
                membresia.setCosto(resultado.getDouble("Costo"));
                membresia.setEstado(resultado.getBoolean("estado"));

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
            ps.setInt(1, membresia.getIdSocio());
            ps.setInt(2, membresia.getCantidadPases());
            // ps.setDate(3, membresia.getFechaInicio());
            // ps.setDate(4, membresia.getFechaFin());
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

            String sql = "SELECT * FROM membresia ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Membresia membresia = new Membresia();
                membresia.setIdMembresia(resultado.getInt("idMembresia"));
                membresia.setIdSocio(resultado.getInt("IdSocio"));
                membresia.setCantidadPases(resultado.getInt("CantidadaPases"));
                //membresia.setFechaInicio(resultado.getDate("FechaInicio"));
                //membresia.setFechaFin(resultado.getDate("FechaFin"));
                membresia.setCosto(resultado.getDouble("Costo"));
                membresia.setEstado(resultado.getBoolean("estado"));
                membresias.add(membresia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return membresias;

    }

}
