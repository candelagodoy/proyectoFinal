
package accesoADatos;

import gimnasiog18.entidades.Socio;
import java.sql.Connection;


public class SocioData {
    private Connection con = null;

    public SocioData() {
        con = Conexion.getConexion();

    }
    
    public void guardarSocio(Socio socio){
    
       String sql;
    
    
    }
}
