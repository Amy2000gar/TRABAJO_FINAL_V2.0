package Entidad;


public class Presupuesto {
    private int idPresu;
    private double precioS;
    private String nombreC,apellidoC,nombreS,descripcionS,fechaI,fechaF;

    //CONSTRUCTORES
    public Presupuesto(){
        this.nombreC ="";
        this.apellidoC="";
        this.nombreS="";
        this.descripcionS="";
        this.fechaI = "";
        this.precioS=0.0;
        this.fechaF="";
    }
    
    public Presupuesto(String nombreC,String apellidoC,String nombreS,String descripcionS,String fechaI,String fechaF, double precioS) {
        this.nombreC =nombreC;
        this.apellidoC=apellidoC;
        this.nombreS=nombreS;
        this.descripcionS=descripcionS;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.precioS=precioS;
    }

    //METODOS GETTER & SETTER
    public double getPrecioS() {
        return precioS;
    }

    public void setPrecioS(double precioS) {
        this.precioS = precioS;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidoC() {
        return apellidoC;
    }

    public void setApellidoC(String apellidoC) {
        this.apellidoC = apellidoC;
    }

    public String getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(String descripcionS) {
        this.descripcionS = descripcionS;
    }
    
    
    public int getIdPresu() {
        return idPresu;
    }

    public void setIdPresu(int idPresu) {
        this.idPresu = idPresu;
    }

   
    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }
    
    
}
