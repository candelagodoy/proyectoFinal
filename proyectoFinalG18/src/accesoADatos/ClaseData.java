
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
    String sql = "INSERT INTO clase (nombre, idEntrenador, horario,capacidad, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre());
            ps.setInt(2,clase.getIdEntrenador());
            Time time = Time.valueOf( clase.getHorario());
            ps.setTime(3, time);
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                clase.setIdEntrenador(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "clase agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Clase");
        }

    }

public List<Clase> listarClases() {
        List<Clase> clases = new ArrayList<>();
        String sql = "SELECT * FROM clase WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Clase clase = new Clase ();
                //int IdClase, String nombre, int IdEntrenador, LocalTime horario, int capacidad, Boolean estado
                clase.setIdEntrenador(resultado.getInt("idClase"));
                clase.setNombre(resultado.getString("nombre"));
                clase.setIdEntrenador(resultado.getInt("idEntrenador"));
                //Time hora= Time.valueOf(resultado.getString("horario"));
               //LocalTime localTime = LocalTime.;
               // clase.setHorario(h);
                clase.setEstado(resultado.getBoolean("estado"));
                clases.add(clase);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Clase ");
        }
        return clases;

    }

  public Clase buscarClasesxNombre(String nombre) {
        Clase clase = null;
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
                clase.setIdEntrenador(resultado.getInt("idEntrenador"));
               //clase.setHorario(LocalTime.MIN.compareTo("horario"));
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
   
//     public Clase buscarXEntrenador(int idEntrenador){
//         return  idEntrenador;
//     }
     
      //public Clase buscarXhorario(){}
      
      //inscribir socio a una clase determinada
}
