package Utils;

//LIBRERIAS JDBC
import java.sql.Connection;     //CONECTIVIDAD
import java.sql.DriverManager;

//
public class MysqlDBConexion 
{
    //CONSTRUCTOR
    static
    {	
    try 
    {
        Class.forName("org.sqlite.JDBC");     //DRIVER QUE VAMOS A UTILIZAR
    }
    catch (ClassNotFoundException e) 
    {
        e.printStackTrace();
    }
    }
    //METODO PARA ESTABLECER CONEXION CON LA BASE DE DATOS
    public static Connection getConexion()      //ABRE Y ESTABLECE LA CONEXION CON LA BASE DE DATOS
    {   
    Connection con=null;
    try 
    {   //CADENA DE CONEXION	    TIPO DE BD / SERVIDOR / BASE DE DATOS / USUARIO / PASSWORD
        con=DriverManager.getConnection("jdbc:sqlite:C:/Users/User/Downloads/SQLiteStudio/veterinaria.db");    
    }
    catch (Exception e) 
    {
        e.printStackTrace();
    }
    return con;
    }
}
