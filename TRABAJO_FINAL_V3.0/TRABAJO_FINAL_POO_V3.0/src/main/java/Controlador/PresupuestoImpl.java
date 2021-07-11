package Controlador;
import Entidad.Presupuesto;
import Modelo.PresupuestoDAO;
import java.util.List;

public class PresupuestoImpl implements IControlador<Presupuesto>
{
    @Override
    public List<Presupuesto> buscarFechas(String fecha1, String fecha2) {
        PresupuestoDAO modeloPresupuesto = new PresupuestoDAO();
        return modeloPresupuesto.buscarFechas(fecha1, fecha2);
    }
        
    @Override
    public List<Presupuesto> consultarTodos() {
        PresupuestoDAO modeloPresupuesto = new PresupuestoDAO();
        return modeloPresupuesto.listar();
    }

    @Override
    public List<Presupuesto> consultarPorNombre(String nombre) {
        PresupuestoDAO modeloPresupuesto = new PresupuestoDAO();
        return modeloPresupuesto.consultarPorNombre(nombre);
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
