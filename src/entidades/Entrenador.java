
package entidades;

public class Entrenador {
    private int IdEntrenador;
    private int Dni;
    private String nombre;
    private String apellido;
    private String especialidad;
    private Boolean estado;

    public Entrenador() {
    }

    public Entrenador(int IdEntrenador, int Dni, String nombre, String apellido, String especialidad, Boolean estado) {
        this.IdEntrenador = IdEntrenador;
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Entrenador(int Dni, String nombre, String apellido, String especialidad, Boolean estado) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public int getIdEntrenador() {
        return IdEntrenador;
    }

    public void setIdEntrenador(int IdEntrenador) {
        this.IdEntrenador = IdEntrenador;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "IdEntrenador=" + IdEntrenador + ", Dni=" + Dni + ", apellido=" + apellido + ", nombre=" + nombre + ", especialidad=" + especialidad + ", estado=" + estado + '}' + "\n";

    }
}
