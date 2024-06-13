
package accesoADatos;
import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SocioData {
    private Connection con = null;

    public SocioData() {
        con = Conexion.getConexion();
    }
    
    public void guardarSocio(Socio socio){ //Probado y Funcionando
        String sql = "INSERT INTO socio(dni,nombre, apellido,edad,correo,telefono,estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setInt(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());
            
            ps.executeUpdate();
            
            ResultSet resultado = ps.getGeneratedKeys();
            if(resultado.next()){
                socio.setIdSocio(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Socio agregado con exito!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio!");
        }
        
        
    
    }
    
    public void actualizarSocio(Socio socio){  //Probado funcionando
        String sql = "UPDATE socio SET dni = ?,nombre = ?,apellido = ?,edad = ?,correo = ?,telefono = ? WHERE idSocio = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, socio.getDni());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setInt(6, socio.getTelefono());
            ps.setInt(7, socio.getIdSocio());
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
            
                JOptionPane.showMessageDialog(null, "Socio modificado con éxito.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Socio no encontrado");
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
        
    }
    
    public void eliminarSocio(int idSocio){ //Probado Funcionando 
        
        try {
            String sql="UPDATE socio SET estado = 0 WHERE idSocio=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null, "Socio eliminado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "El ID ingresado no corresponde a un socio activo");
            } 
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
        
    }
    
    public List<Socio> listarSociosActivos(){ //Probado funcionando
        List<Socio> socios = new ArrayList<>();
        String sql = "SELECT * FROM socio WHERE estado = 1";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Socio socio = new Socio();
                socio.setIdSocio(resultado.getInt("IdSocio"));
                socio.setDni(resultado.getString("dni"));
                socio.setNombre(resultado.getString("nombre"));
                socio.setApellido(resultado.getString("apellido"));
                socio.setEdad(resultado.getInt("edad"));
                socio.setCorreo(resultado.getString("correo"));
                socio.setTelefono(resultado.getInt("telefono"));
                socio.setEstado(resultado.getBoolean("estado"));
                socios.add(socio);
            }
            
            ps.close();
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
        
        return socios; 
    }
    
    public List<Socio> listarTodosLosSocios(){
        List<Socio> socios = new ArrayList<>();
        String sql = "SELECT * FROM socio";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Socio socio = new Socio();
                socio.setIdSocio(resultado.getInt("IdSocio"));
                socio.setDni(resultado.getString("dni"));
                socio.setNombre(resultado.getString("nombre"));
                socio.setApellido(resultado.getString("apellido"));
                socio.setEdad(resultado.getInt("edad"));
                socio.setCorreo(resultado.getString("correo"));
                socio.setTelefono(resultado.getInt("telefono"));
                socio.setEstado(resultado.getBoolean("estado"));
                socios.add(socio);
            }
            
            ps.close();
             
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
        
        return socios; 
    
    }
    
    
    public Socio buscarSocioPorNumeroDni(String dni){ //Probado Funcionando
        Socio socio = null;
        String sql = "SELECT IdSocio, nombre, apellido, edad, correo, telefono FROM socio WHERE dni = ? AND estado = 1";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet resultado = ps.executeQuery();
            if(resultado.next()){
                socio = new Socio();
                socio.setIdSocio(resultado.getInt("IdSocio"));
                socio.setNombre(resultado.getString("nombre"));
                socio.setApellido(resultado.getString("apellido"));
                socio.setEdad(resultado.getInt("edad"));
                socio.setCorreo(resultado.getString("correo"));
                socio.setTelefono(resultado.getInt("telefono"));   
                socio.setEstado(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe el socio");
            
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
    
        return socio;
    }
    
}
