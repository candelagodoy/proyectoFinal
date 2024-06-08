
package accesoADatos;

import entidades.Asistencia;
import entidades.Membresia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
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
    
    public void guardarAsistencia (Asistencia asistencia){//PROBADO, GUARDA LA ASISTENCIA, NO DESCUENTA LA CANTIDAD DE PASES 
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
    //debe ser un delete
    public void eliminarAsistencia (){
    
    
    }
}
