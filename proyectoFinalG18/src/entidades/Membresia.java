
package entidades;

import java.time.LocalDate;

public class Membresia {
    private int IdMembresia;
    private Socio socio;
    private int CantidadPases;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private double Costo;
    private Boolean estado;

    public Membresia() {
    }

    public Membresia(int IdMembresia, Socio socio, int CantidadPases, LocalDate FechaInicio, LocalDate FechaFin, double Costo, Boolean estado) {
        this.IdMembresia = IdMembresia;
        this.socio = socio;
        this.CantidadPases = CantidadPases;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Costo = Costo;
        this.estado = estado;
    }

    public Membresia(Socio socio, int CantidadPases, LocalDate FechaInicio, LocalDate FechaFin, double Costo, Boolean estado) {
        this.socio = socio;
        this.CantidadPases = CantidadPases;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Costo = Costo;
        this.estado = estado;
    }

    public int getIdMembresia() {
        return IdMembresia;
    }

    public void setIdMembresia(int IdMembresia) {
        this.IdMembresia = IdMembresia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

   

    public int getCantidadPases() {
        return CantidadPases;
    }

    public void setCantidadPases(int CantidadPases) {
        this.CantidadPases = CantidadPases;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Membresia{" + "IdMembresia=" + IdMembresia + ", Socio=" + socio + ", cantidadPases=" + CantidadPases + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ",costo=" + Costo + ", estado=" + estado + '}' + "\n";

    }
}
