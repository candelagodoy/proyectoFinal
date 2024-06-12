package accesoADatos;

import entidades.Clase;
import entidades.Entrenador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClaseData {

    private Connection con = null;
    private EntrenadorData entData = new EntrenadorData();

    public ClaseData() {
        con = Conexion.getConexion();
    }

    public void guardarClase(Clase clase) { //PROBADO Y FUNCIONANDO
        
        String sql = "INSERT INTO clase (nombre, IdEntrenador, horario,capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre());
            ps.setInt(2, clase.getentrenador().getIdEntrenador());
            Time time = Time.valueOf(clase.getHorario());
            ps.setTime(3, time);
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            
            if (resultado.next()) {
                clase.setIdClase(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Clase agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Clase");
        }

    }
  
    
    public void eliminarClase (int idClase){//PROBADA Y FUNCIONANDO
        String sql="UPDATE clase SET estado = 0 WHERE IdClase = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idClase);
            int filas = ps.executeUpdate();
            
            if(filas == 1){
                JOptionPane.showMessageDialog(null,"Clase eliminada con éxito.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Clase no encontrada.");
                        
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Clase ");
        }
        
    
    }

    public List<Clase> listarClases() {//PROBADO Y FUNCIONANDO
        List<Clase> clases = new ArrayList<>();
        String sql = "SELECT * FROM clase WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            
            while (resultado.next()) {
                Clase clase = new Clase();
                Entrenador entrenador = new Entrenador();
                clase.setIdClase(resultado.getInt("IdClase"));
                clase.setNombre(resultado.getString("nombre"));
                entrenador.setIdEntrenador(resultado.getInt("IdEntrenador"));
                clase.setentrenador(entrenador);
                clase.setHorario(resultado.getTime("horario").toLocalTime());
                clase.setCapacidad(resultado.getInt("capacidad"));
                clase.setEstado(resultado.getBoolean("estado"));
                clases.add(clase);
            }
           
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Clase ");
        }
        return clases;

    }

    public Clase buscarClasePorNombre(String nombre) {//PROBADO Y FUNCIONANDO
        Clase clase = null;
        String sql = "SELECT IdClase, IdEntrenador, horario, capacidad FROM clase WHERE nombre=? AND estado = 1";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                clase = new Clase();
                Entrenador entrenador = new Entrenador();
                clase.setIdClase(resultado.getInt("IdClase"));
                entrenador.setIdEntrenador(resultado.getInt("idEntrenador"));
                clase.setentrenador(entrenador);
                clase.setHorario(resultado.getTime("horario").toLocalTime());
                clase.setCapacidad(resultado.getInt("capacidad"));
                clase.setEstado(true);
                clase.setNombre(nombre);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe la clase");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase ");
        }

        return clase;
    }
    
    public void ModificarClase(Clase clase){ //probado y funcionando
        String sql = "UPDATE clase SET nombre = ?, IdEntrenador = ? , horario = ? , capacidad=? WHERE IdClase=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, clase.getNombre());
            ps.setInt(2, clase.getentrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorario()));
            ps.setInt(4, clase.getCapacidad());
            ps.setInt(5, clase.getIdClase());
            int filas = ps.executeUpdate();
            if(filas == 1){
                JOptionPane.showMessageDialog(null, "Clase modificada con éxito!");
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Clase no encontrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase ");
        }
    
    
    }

    public void ModificarCapacidadClase(Clase clase){//PROBADO Y FUNCIONANDO
        String sql = "UPDATE clase SET capacidad = ? WHERE IdClase=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, (clase.getCapacidad()-1));
            ps.setInt(2, clase.getIdClase());
            
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Capacidad reducida");
            }
            else{
                JOptionPane.showMessageDialog(null,"Clase no encontrada");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase ");
        }
        
    
    }
}
