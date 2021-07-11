package Controlador;
import java.util.List;

//REALIZA LAS OPERACIONES BASICAS PARA LAS TODAS LAS TABLAS
//OPERACIONES COMUNES DE TODOAS LAS TABLAS
//CLASE GENERICA: REALIZA OPERACIONES PARA DISTINTAS CLASES
public interface IControlador<T>
{
    public abstract List<T> consultarTodos();   //DEVUELVE UNA LISTA DE TODOS LOS ELEMENTOS
    public abstract List<T> consultarPorNombre(String nombre);    
    public abstract List<T> buscarFechas(String fecha1, String fecha2);
    public abstract int insertar(T objeto);
    public abstract int modificar(T objeto);
    public abstract int eliminar(T objeto);
}