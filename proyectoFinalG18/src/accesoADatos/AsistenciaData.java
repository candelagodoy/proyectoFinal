
package accesoADatos;

import entidades.Asistencia;
import entidades.Clase;
import entidades.Membresia;
import entidades.Socio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AsistenciaData {
    private Connection con = null;
    private SocioData socioData = new SocioData();
    private ClaseData claseData = new ClaseData();
    private MembresiaData membresiaData = new MembresiaData();

    public AsistenciaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAsistencia (Asistencia asistencia){//PROBADO Y FUNCIONANDO
        String sql="INSERT INTO asistencia (IdSocio, IdClase, FechaAsistencia) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, asistencia.getSocio().getIdSocio());
            ps.setInt(2, asistencia.getClase().getIdClase());
            ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            
            if(resultado.next()){
               asistencia.setIdAsistencia(resultado.getInt(1));
               String dni=asistencia.getSocio().getDni();
               Membresia membre = membresiaData.buscarMembresia(dni);
               membresiaData.modificarCantidadPases(membre);
              
               JOptionPane.showMessageDialog(null, "Asistencia agregada con exito!");
            
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia");
        }
        
    }
    
    public void eliminarAsistencia (int idSocio, int idClase){//PROBADO Y FUNCIONANDO
        String sql = "DELETE FROM asistencia WHERE IdSocio = ? AND IdClase = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ps.setInt(2, idClase);
            int filas = ps.executeUpdate();
            if(filas == 1){
                JOptionPane.showMessageDialog(null, "Asistencia eliminada con exito!");
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia");
        }
        
    }
    
    public void modificarAsistencia(Asistencia asistencia){//PROBADO Y FUNCIONANDO
        String sql = "UPDATE asistencia SET IdSocio= ?, IdClase = ?, FechaAsistencia = ? WHERE IdAsistencia";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, asistencia.getSocio().getIdSocio());
            ps.setInt(2, asistencia.getClase().getIdClase());
            ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            ps.setInt(4, asistencia.getIdAsistencia());
            int filas = ps.executeUpdate();
            if(filas == 1){
                JOptionPane.showMessageDialog(null, "Asistencia modificada con éxito!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Asistencia no encontrada ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia");
        }
        
        
    }
    public List<Asistencia> listandoAsistencia(){//PROBADO Y FUNCIONANDO
        List<Asistencia> asistencias = new ArrayList();
        
        try {
            String sql = " SELECT IdAsistencia, IdSocio, IdClase, FechaAsistencia FROM asistencia";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Asistencia asistencia = new Asistencia();
                Socio socio = new Socio();
                Clase clase = new Clase();
                
                asistencia.setIdAsistencia(resultado.getInt("IdAsistencia"));
                socio.setIdSocio(resultado.getInt("IdSocio"));
                asistencia.setSocio(socio);
                clase.setIdClase(resultado.getInt("IdClase"));
                asistencia.setClase(clase);
                asistencia.setFechaAsistencia(resultado.getDate("FechaAsistencia").toLocalDate());
                asistencias.add(asistencia);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia");
        }
        return asistencias;
    }
    
    public List<Asistencia> asistenciaPorSocio(int idSocio){//PROBADO Y FUNCIONANDO
        List<Asistencia> asistencias = new ArrayList();
        String sql = "SELECT IdAsistencia, IdSocio, IdClase, FechaAsistencia FROM asistencia WHERE IdSocio=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Asistencia asistencia = new Asistencia();
                Socio socio = new Socio();
                Clase clase = new Clase();
                
                asistencia.setIdAsistencia(resultado.getInt("IdAsistencia"));
                socio.setIdSocio(resultado.getInt("IdSocio"));
                asistencia.setSocio(socio);
                clase.setIdClase(resultado.getInt("IdClase"));
                asistencia.setClase(clase);
                asistencia.setFechaAsistencia(resultado.getDate("FechaAsistencia").toLocalDate());
                asistencias.add(asistencia);
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia");
        }
        return asistencias;
    }
    
    
}
