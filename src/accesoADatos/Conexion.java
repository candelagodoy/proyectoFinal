
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String BD="gimnasiog18";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection conexion;

    private Conexion() {}
    
    public static Connection getConexion(){
        
        if(conexion == null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL+BD , USUARIO , PASSWORD);
                JOptionPane.showMessageDialog(null, "Conectado!");
               
                
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
            }catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar el driver");
            }
          
        }
        
        return conexion;
    }
}
