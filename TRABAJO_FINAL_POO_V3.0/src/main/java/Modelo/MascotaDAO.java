package Modelo;
import Controlador.IControlador;
import Entidad.Mascota;
import Utils.MysqlDBConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MascotaDAO implements BaseDAO<Mascota>
{
    @Override
    public List<Mascota> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mascota cosultarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mascota> consultarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Mascota objeto) {
        int salida =-1;
        Connection conn= null;          //Conexion
        PreparedStatement pstm = null;  //Consultas
        try 
        {   //ABRE CONEXION CON BASE DE DATOS
            conn = MysqlDBConexion.getConexion();
            //SENTENCIA SQL LANZAMOS A BASE DE DATOS
            String sql ="insert into mascota(idMasco,nombreMasco,raza,color,tamaño,peso,)" + "values(null,?,?,?,?,?,?)";

            //EJECUTAMOS SENTENCIA SQL
            pstm = conn.prepareStatement(sql);
            //EXTRAEMOS LOS VALORES
            pstm.setString(1, objeto.getDNI());
            pstm.setString(2, objeto.getNombres());   
            pstm.setString(3, objeto.getRaza());
            pstm.setString(4, objeto.getColor());
            pstm.setString(5, objeto.getTamaño());
            pstm.setString(6, objeto.getPeso());
            //COPIAMOS OBJETO A LA LISTA    
            salida = pstm.executeUpdate();      //COLECCION DE OBJETOS DEVUELTOS POR LA CONSULTA
            
        } 
        catch (Exception e) 
        {	e.printStackTrace();
        } 
        finally
        {  	try 
        	{   
                if(pstm!= null) pstm.close();
                if(conn!= null) conn.close();
        	} 
        	catch (Exception e2) {	}
        }
        
        return salida;
    }

    @Override
    public int modificar(Mascota objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Mascota objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
