
package entidades;

public class Socio {
    private int IdSocio;
    private String Dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private int telefono;
    private Boolean estado;
    
    
    public Socio(){
    }
    public Socio(int IdSocio, String Dni, String nombre, String apellido, int edad, String correo, int telefono, Boolean estado){
        this.IdSocio= IdSocio;
        this.Dni= Dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.correo= correo;
        this.telefono=telefono;
        this.estado= estado;
    }
    
    public Socio(String Dni, String nombre, String apellido, int edad, String correo, int telefono, Boolean estado){
        this.Dni= Dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.correo= correo;
        this.telefono=telefono;
        this.estado= estado;
    }

    public int getIdSocio() {
        return IdSocio;
    }

    public void setIdSocio(int IdSocio) {
        this.IdSocio = IdSocio;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString() {
        return  IdSocio + "-" + nombre+ "" + apellido;
    
        
    }
}
