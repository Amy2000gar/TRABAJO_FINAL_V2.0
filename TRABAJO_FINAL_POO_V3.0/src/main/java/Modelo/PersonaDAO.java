package Modelo;
import Entidad.*;
import java.util.List;
import java.util.ArrayList;

import Utils.MysqlDBConexion;
import Controlador.PersonaImpl;

//Librerias JDBC
import java.sql.Connection;         //CONECTARME A LA BASE DE DATOS
import java.sql.PreparedStatement;    //LANZAR LAS CONSULTAS A LA BASE DE DATOS
import java.sql.ResultSet;            //OBTENER RESULTADOS

public class PersonaDAO implements BaseDAO<Persona>
{
    @Override
    public List<Persona> listar() {
        List<Persona> listaPersonas = new ArrayList<Persona>();
		
        Connection conn= null;          //Conexion
        PreparedStatement pstm = null;  //Consultas
        ResultSet rs = null;            //Resultados
        try 
        {   //ABRE CONEXION CON BASE DE DATOS
            conn = MysqlDBConexion.getConexion();
            //SENTENCIA SQL LANZAMOS A BASE DE DATOS
            String sql ="select * from cliente";
            //EJECUTAMOS SENTENCIA SQL
            pstm = conn.prepareStatement(sql);
            //LECTURA DE LOS DATOS QUE DEVUELVE LA BD
            rs = pstm.executeQuery();     //Lanza la consulta    //rs(Objeto que almacena los datos de la consulta)
            //CREAMOS OBJETOS CLIENTE
            Persona objPersona = null;
            while(rs.next())    //rs.next Recorre los registros devueltos por la consulta
            { 	//Copiamos los datos en un objeto
                objPersona = new Persona();
            	objPersona.setId(rs.getInt("idCliente"));
                objPersona.setDNI(rs.getString("DNI"));
            	objPersona.setNombres(rs.getString("nombreClie"));
                objPersona.setApellidos(rs.getString("apellidoClie"));
                objPersona.setCorreo(rs.getString("correo"));
            	objPersona.setDireccion(rs.getString("direccion"));
                objPersona.setDistrito(rs.getString("distrito"));
                objPersona.setTelefono(rs.getString("celular"));
            	objPersona.setContraseña(rs.getString("contraseña"));
                //COPIAMOS OBJETO A LA LISTA    
            	listaPersonas.add(objPersona);      //COLECCION DE OBJETOS DEVUELTOS POR LA CONSULTA
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

        return listaPersonas;
    }

    @Override
    public Persona cosultarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> consultarPorNombre(String nombre) {
        List<Persona> listaPersonas = new ArrayList<Persona>();
		
        Connection conn= null;          //Conexion
        PreparedStatement pstm = null;  //Consultas
        ResultSet rs = null;            //Resultados
        try 
        {   //ABRE CONEXION CON BASE DE DATOS
            conn = MysqlDBConexion.getConexion();
            //SENTENCIA SQL LANZAMOS A BASE DE DATOS
            String sql ="select * from presupuesto where ";
            //EJECUTAMOS SENTENCIA SQL
            pstm = conn.prepareStatement(sql);
            //LECTURA DE LOS DATOS QUE DEVUELVE LA BD
            rs = pstm.executeQuery();     //Lanza la consulta    //rs(Objeto que almacena los datos de la consulta)
            //CREAMOS OBJETOS CLIENTE
            Persona objPersona = null;
            while(rs.next())    //rs.next Recorre los registros devueltos por la consulta
            { 	//Copiamos los datos en un objeto
                objPersona = new Persona();
            	objPersona.setId(rs.getInt("idCliente"));
                objPersona.setDNI(rs.getString("DNI"));
            	objPersona.setNombres(rs.getString("nombreClie"));
                objPersona.setApellidos(rs.getString("apellidoClie"));
                objPersona.setCorreo(rs.getString("correo"));
            	objPersona.setDireccion(rs.getString("direccion"));
                objPersona.setDistrito(rs.getString("distrito"));
                objPersona.setTelefono(rs.getString("celular"));
            	objPersona.setContraseña(rs.getString("contraseña"));
                //COPIAMOS OBJETO A LA LISTA    
            	listaPersonas.add(objPersona);      //COLECCION DE OBJETOS DEVUELTOS POR LA CONSULTA
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

        return listaPersonas;
    }

    @Override
    public int insertar(Persona objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Persona objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Persona objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validar(String usuario, String contraseña){
        boolean estado = false;
        this.listar();
        /*for (Cliente cli : listaClientes) {
            
        }*/
        
        return estado;
    }
}
