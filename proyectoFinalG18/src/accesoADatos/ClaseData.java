
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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClaseData {
    
    private Connection con = null;
    private EntrenadorData entData= new EntrenadorData();
    
    public ClaseData(){
     con = Conexion.getConexion();
}
public void guardarClase(Clase clase) { //int IdClase, String nombre, int IdEntrenador, LocalTime horario, int capacidad, Boolean estado
     Entrenador ent=null;
    String sql = "INSERT INTO clase (nombre, idEntrenador, horario,capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre());
            ps.setInt(2, clase.getentrenador().getIdEntrenador());
            Time time = Time.valueOf( clase.getHorario());
            ps.setTime(3, time);
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                clase.setentrenador(ent);
                JOptionPane.showMessageDialog(null, "clase agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Clase");
        }

    }


public List<Clase> listarClases() {
        List<Clase> clases = new ArrayList<>();
        Entrenador ent=null;
        String sql = "SELECT * FROM clase WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            Clase clase = new Clase ();
            while (resultado.next()) {
                //int IdClase, String nombre, Entrenador entrenador, LocalTime horario, int capacidad, Boolean estado
                clase.setIdClase(resultado.getInt("idClase"));
                clase.setNombre(resultado.getString("nombre"));
                int idEntrenador = resultado.getInt("idEntrenador");
            Entrenador entrenador = entData.buscarEntrenador(idEntrenador);
            clase.setentrenador(entrenador);
            java.sql.Time hora = resultado.getTime("horario");
            if (hora != null) {
                clase.setHorario(hora.toLocalTime());
            }
            clase.setEstado(resultado.getBoolean("estado"));
            clases.add(clase);
        }
                clases.add(clase);            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Clase ");
        }
        return clases;

    }

  public Clase buscarClasesxNombre(String nombre) {
    Clase clase = null;
    Entrenador ent = null;
    String sql = "SELECT idClase, nombre, idEntrenador, horario, capacidad FROM clase WHERE nombre=? AND estado = 1";
    PreparedStatement ps = null;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ResultSet resultado = ps.executeQuery();
        if (resultado.next()) {
            clase = new Clase();
            clase.setIdClase(resultado.getInt("idClase"));
            clase.setNombre(resultado.getString("nombre"));
            ent = new Entrenador(); 
            ent.setIdEntrenador(resultado.getInt("idEntrenador"));
            clase.setentrenador(ent);
            java.sql.Time hora = resultado.getTime("horario");
            clase.setHorario(hora.toLocalTime());
            clase.setEstado(true);
        } else {
            JOptionPane.showMessageDialog(null, "No existe la clase");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla clase ");
    }

    return clase;
}
   

      //inscribir socio a una clase determinada
  
  
}
