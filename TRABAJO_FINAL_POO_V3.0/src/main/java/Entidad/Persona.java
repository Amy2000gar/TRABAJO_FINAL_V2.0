package Entidad;

public class Persona extends Cliente
{
    //ATRIBUTOS
    private String apellidos;
    private String direccion;
    private String correo;
    private String contraseña;
    private String telefono;
    private String distrito;

    //CONSTRUCTOR
    public Persona(){
        this.apellidos = "";
        this.direccion = "";
        this.correo = "";
        this.contraseña = "";
        this.telefono = "";
        this.distrito = "";
    }

    public Persona(String nombre, String DNI,String apellidos,String direccion,String correo,
                   String contraseaña,String telefono, String distrito) {
        super(nombre, DNI);
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.distrito = distrito;
    }
    
    //METODOS GETTER & SETTER
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
}
