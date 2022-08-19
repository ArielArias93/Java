package sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadosCRUD {
    /**
     * C-Create
     * R- Read
     * U-Update
     * D-Delete
     */

    //  ESTRUCTURA DE DATOS
    private List<Empleados> empleado = new ArrayList<>();

    //  OPERACIONES CRUD

    //  CREATE
    public void guardar(Empleados empleados){

        empleado.add(empleados);
        }

    // BUSCAR

    public List<Empleados> buscar(){

        return empleado;
    }
}
