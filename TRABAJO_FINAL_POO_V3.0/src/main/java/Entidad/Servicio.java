package Entidad;

public class Servicio 
{
    //ATRIBUTOS
    private String idServicio,idCategoriatipoServicio,descripcion, comentario;
    private double precio;
    
    //CONSTRUCTOR
    public Servicio(){
        
    }
    
    public Servicio(String idServicio, String idCategoriatipoServicio, String descripcion, String comentario, double precio) {
        this.idServicio = idServicio;
        this.idCategoriatipoServicio = idCategoriatipoServicio;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.precio = precio;
    }
    //METODOS GETTER & SETTER
    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getIdCategoriatipoServicio() {
        return idCategoriatipoServicio;
    }

    public void setIdCategoriatipoServicio(String idCategoriatipoServicio) {
        this.idCategoriatipoServicio = idCategoriatipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

}
