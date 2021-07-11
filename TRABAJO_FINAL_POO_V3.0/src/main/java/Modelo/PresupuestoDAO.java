package Modelo;

import Entidad.Persona;
import Entidad.Servicio;
import Utils.MysqlDBConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Entidad.Presupuesto;
/**
 *
 * @author laura
 */
public class PresupuestoDAO implements BaseDAO<Presupuesto>
{
    public List<Presupuesto> buscarFechas(String fecha1, String fecha2){
        
        List<Presupuesto> listaPresupuestos = new ArrayList<Presupuesto>();
        Connection conn= null;          //Conexion
        PreparedStatement pstm = null;  //Consultas
        ResultSet rs = null;            //Resultados
        try 
        {   //ABRE CONEXION CON BASE DE DATOS
            conn = MysqlDBConexion.getConexion();
            //SENTENCIA SQL LANZAMOS A BASE DE DATOS
            String sql ="SELECT distinct nombreClie, apellidoClie, nomServicio, precio, "
                    + "fecha, descripcion from cliente c inner join servicio s inner join presupuesto p on p.idCliente= c.idCliente where fecha between '"+fecha1+"' AND '"+fecha2+"';";
            //EJECUTAMOS SENTENCIA SQL
            pstm = conn.prepareStatement(sql);
            //LECTURA DE LOS DATOS QUE DEVUELVE LA BD
            rs = pstm.executeQuery();     //Lanza la consulta    //rs(Objeto que almacena los datos de la consulta)
            //CREAMOS OBJETOS¨PRESUPUESTO, PERSONA Y SERVICIO
            Presupuesto objPresupuesto = null;
            
            while(rs.next())    //rs.next Recorre los registros devueltos por la consulta
            { 	//CREAMOS LAS INTANCIAS
                objPresupuesto = new Presupuesto();
                //Copiamos los datos en un objeto
                objPresupuesto.setNombreC(rs.getString("nombreClie"));
                objPresupuesto.setApellidoC(rs.getString("apellidoClie"));
                objPresupuesto.setNombreS(rs.getString("nomServicio"));
                objPresupuesto.setPrecioS(rs.getDouble("precio"));
                objPresupuesto.setFechaI(rs.getString("fecha"));
                objPresupuesto.setDescripcionS(rs.getString("descripcion"));
                //COPIAMOS OBJETO A LA LISTA    
            	listaPresupuestos.add(objPresupuesto);      //COLECCION DE OBJETOS DEVUELTOS POR LA CONSULTA
            }
        } 
        catch (Exception e) 
        {	e.printStackTrace();
        } 
        finally
        {  	try 
        	{   if(rs!= null) rs.close();
                if(pstm!= null) pstm.close();
                if(conn!= null) conn.close();
        	} 
        	catch (Exception e2) {	}
        }

        return listaPresupuestos;
    
    }
    
    public List<Presupuesto> listar() {
        List<Presupuesto> listaPresupuestos = new ArrayList<Presupuesto>();
		
        Connection conn= null;          //Conexion
        PreparedStatement pstm = null;  //Consultas
        ResultSet rs = null;            //Resultados
        try 
        {   //ABRE CONEXION CON BASE DE DATOS
            conn = MysqlDBConexion.getConexion();
            //SENTENCIA SQL LANZAMOS A BASE DE DATOS
            String sql ="SELECT nombreClie, apellidoClie, nomServicio, precio, "
                    + "fecha, descripcion from cliente c inner join servicio s inner join presupuesto p on p.idCliente= c.idCliente where nombreClie like 'a%';";
            //EJECUTAMOS SENTENCIA SQL
            pstm = conn.prepareStatement(sql);
            //LECTURA DE LOS DATOS QUE DEVUELVE LA BD
            rs = pstm.executeQuery();     //Lanza la consulta    //rs(Objeto que almacena los datos de la consulta)
            //CREAMOS OBJETOS¨PRESUPUESTO, PERSONA Y SERVICIO
            Presupuesto objPresupuesto = null;
            
            while(rs.next())    //rs.next Recorre los registros devueltos por la consulta
            { 	//CREAMOS LAS INTANCIAS
                objPresupuesto = new Presupuesto();
                //Copiamos los datos en un objeto
                objPresupuesto.setNombreC(rs.getString("nombreClie"));
                objPresupuesto.setApellidoC(rs.getString("apellidoClie"));
                objPresupuesto.setNombreS(rs.getString("nomServicio"));
                objPresupuesto.setPrecioS(rs.getDouble("precio"));
                objPresupuesto.setFechaI(rs.getString("fecha"));
                objPresupuesto.setDescripcionS(rs.getString("descripcion"));
                //COPIAMOS OBJETO A LA LISTA    
            	listaPresupuestos.add(objPresupuesto);      //COLECCION DE OBJETOS DEVUELTOS POR LA CONSULTA
            }
        } 
        catch (Exception e) 
        {	e.printStackTrace();
        } 
        finally
        {  	try 
        	{   if(rs!= null) rs.close();
                if(pstm!= null) pstm.close();
                if(conn!= null) conn.close();
        	} 
        	catch (Exception e2) {	}
        }

        return listaPresupuestos;
    }

    @Override
    public Presupuesto cosultarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List consultarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Presupuesto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Presupuesto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Presupuesto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
