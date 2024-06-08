
package accesoADatos;

import java.sql.Connection;

public class AsistenciaData {
    private Connection con = null;
    private SocioData socioData = new SocioData();
    private ClaseData claseData = new ClaseData();

    public AsistenciaData() {
        con = Conexion.getConexion();
    }
    
    
}
