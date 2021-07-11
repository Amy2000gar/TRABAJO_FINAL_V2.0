package Entidad;

public class Cliente 
{
    //ATRIBUTOS
    protected int id;
    protected String nombres,DNI;

    //CONSTRUCTORES
    public Cliente(String nombre, String DNI){
        this.nombres = nombre;
        this.DNI= DNI;
    }
    
    public Cliente() 
    {
        this.id = 0;
        this.nombres = "";
        this.DNI ="";
    }

    //METODOS GETTER & SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
}
