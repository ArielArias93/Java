package conInterfaces;

import sinInterfaces.Empleados;

import java.util.List;

public interface EmpleadoCRUD {

    void guardar(Empleados empleado);

    List<Empleados> buscar();

    void borrar(Empleados empleado);
}
