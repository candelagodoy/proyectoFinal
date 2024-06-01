
package gimnasiog18.entidades;

import java.util.Date;


public class Asistencia {

    private int IdAsistencia;
    private int IdSocio;
    private int IdClase;
    private Date FechaAsistencia;

    public Asistencia() {

    }

    public Asistencia(int IdAsistencia, int IdSocio, int IdClase, Date FechaAsistencia) {
        this.IdAsistencia = IdAsistencia;
        this.IdSocio = IdSocio;
        this.IdClase = IdClase;
        this.FechaAsistencia = FechaAsistencia;

    }

    public Asistencia(int IdSocio, int IdClase, Date FechaAsistencia) {
        this.IdSocio = IdSocio;
        this.IdClase = IdClase;
        this.FechaAsistencia = FechaAsistencia;
    }

    public int getIdAsistencia() {
        return IdAsistencia;
    }

    public void setIdAsistencia(int IdAsistencia) {
        this.IdAsistencia = IdAsistencia;
    }

    public int getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(int IdSocio) {
        this.IdSocio = IdSocio;
    }

    public int getIdClase() {
        return IdClase;
    }

    public void setIdClase(int IdClase) {
        this.IdClase = IdClase;
    }

    public Date getFechaAsistencia() {
        return FechaAsistencia;
    }

    public void setFechaAsistencia(Date FechaAsistencia) {
        this.FechaAsistencia = FechaAsistencia;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "IdAsistencia=" + IdAsistencia + ", IdSocio=" + IdSocio + ", IdClase=" + IdClase + ", FechaAsistencia=" + '}' + "\n";

    }

}
