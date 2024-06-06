
package entidades;

import java.time.LocalTime;


public class Clase {
    private int IdClase;
    private String nombre;
    private Ent;
    private LocalTime horario;
    private int capacidad;
    private Boolean estado;

    public Clase() {
    }

    public Clase(int IdClase, String nombre, int IdEntrenador, LocalTime horario, int capacidad, Boolean estado) {
        this.IdClase = IdClase;
        this.nombre = nombre;
        this.IdEntrenador = IdEntrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Clase(String nombre, int IdEntrenador, LocalTime horario, int capacidad, Boolean estado) {
        this.nombre = nombre;
        this.IdEntrenador = IdEntrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdClase() {
        return IdClase;
    }

    public void setIdClase(int IdClase) {
        this.IdClase = IdClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(int IdEntrenador) {
        this.IdEntrenador = IdEntrenador;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Clase{" + "IdClase=" + IdClase + ", nombre=" + nombre + ", IdEntrenador=" + IdEntrenador + ", horario=" + horario + ", capacidad=" + capacidad + ", estado=" + estado + '}'+"\n";
    
                }
}
