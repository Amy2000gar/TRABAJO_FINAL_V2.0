package Entidad;

public class Categoria 
{
    //ATRIBUTOS
    private int ID_Categoria;
    private String nombreCategoria;
    private String idServicio;
    
    //AGREGACION LAS PARTES PUEDEN SUBSTIR INDEPENDIENTE DEL TODO
    //LA AGREGACION SE REPRESENTA COMO UNA CLASE QUE ESTA DENTRO DE OTRA
    //OBJETOS DE LA CLASE SERVICIO VAN A ESTAR INCLUIDOS EN LA CLASE SERVICIO(ARRAYLIST)
    //PRIVATE ARRAYLIST<SERVICIO> SERVICIOS; (EJEMPLO)
    
    //CONSTRUCTOR
    public Categoria(){
        
    }
    
    public Categoria(int ID_Categoria, String nombreCategoria) {
        this.ID_Categoria = ID_Categoria;
        this.nombreCategoria = nombreCategoria;
    }
    
    //METODOS GETTER & SETTER
    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
}
