package Modelo;
import java.util.List;

//INTERACTUAN CON LA BASE DE DATOS(LANZAN LAS CONSULTAS A LA BASE DE DATOS)
//Esta clase es la una interfaz que implementa los metodos comunes
//Metodos que interactuan con la BD

public interface BaseDAO<T> 
{   //OPERACIONES BASICAS QUE SE PUEDEN HACER EN TODAS LAS TABLAS
    public abstract List<T> listar();                                   //DEVUELVE TODOS LOS OBJETOS
    public abstract T cosultarPorID(int id);                            //DEVUELVE UN OBJETO
    public abstract List<T> consultarPorNombre(String nombre);          //DEVUELVE LOS OBJETOS FILTRADOS
    public abstract int insertar(T objeto);                             //INSERTAR UN NUEVO OBJETO
    public abstract int modificar(T objeto);                            //MODIFICA UN OBJETO
    public abstract int eliminar(T objeto);                             //ELIMINA UN OBJETO
}
