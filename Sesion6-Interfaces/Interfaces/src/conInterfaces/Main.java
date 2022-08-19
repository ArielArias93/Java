package conInterfaces;

import sinInterfaces.Empleados;

public class Main {

    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {

        empleadoCRUD.buscar();
        empleadoCRUD.guardar(new Empleados());
        empleadoCRUD.borrar(new Empleados());

    }
}
