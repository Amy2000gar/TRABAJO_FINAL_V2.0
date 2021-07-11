package Controlador;

import Entidad.Persona;
import java.util.List;
import java.util.ArrayList;
import Modelo.*;

//CLASE QUE IMPLEMENTA LOS METODOS DE LA INTERFAZ BASE ICONTROLADOR
public class PersonaImpl implements IControlador<Persona>
{
    @Override
    public List<Persona> consultarTodos() {
       PersonaDAO modeloPersona = new PersonaDAO();
       return modeloPersona.listar();
    }

    @Override
    public List<Persona> consultarPorNombre(String nombre) {
        return null;
    }

    @Override
    public int insertar(Persona objeto) {
        return 0;
    }

    @Override
    public int modificar(Persona objeto) {
        return 0;
    }

    @Override
    public int eliminar(Persona objeto) {
        return 0;
    } 

    @Override
    public List<Persona> buscarFechas(String fecha1, String fecha2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
