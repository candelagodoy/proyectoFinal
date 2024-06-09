
package entidades;

import java.time.LocalDate;
import java.util.Date;

public class Asistencia {
    private int IdAsistencia;
    private Socio socio;
    private Clase clase;
    private LocalDate FechaAsistencia;

    public Asistencia() {

    }

    public Asistencia(int IdAsistencia, Socio socio, Clase clase, LocalDate FechaAsistencia) {
        this.IdAsistencia = IdAsistencia;
        this.socio = socio;
        this.clase= clase;
        this.FechaAsistencia = FechaAsistencia;

    }

    public Asistencia(Socio socio, Clase clase, LocalDate FechaAsistencia) {
        this.socio = socio;
        this.clase = clase;
        this.FechaAsistencia = FechaAsistencia;
    }

    public int getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(int IdAsistencia) {
        this.IdAsistencia = IdAsistencia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    

    public LocalDate getFechaAsistencia() {
        return FechaAsistencia;
    }

    public void setFechaAsistencia(LocalDate FechaAsistencia) {
        this.FechaAsistencia = FechaAsistencia;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "IdAsistencia=" + IdAsistencia + ", Socio=" + socio.getIdSocio() + ", Clase=" + clase.getIdClase() + ", FechaAsistencia=" + '}' + "\n";

    }

}
