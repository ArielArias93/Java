package sinInterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadosCRUD empleadosCRUD = new EmpleadosCRUD();


        Empleados Ariel = new Empleados("Ariel", "Arias", 29, 4000, true);
        Empleados Lionel = new Empleados("Lionel", "Messi", 35, 40000, true);
        Empleados Ronaldinho = new Empleados("Ronaldinho", "Gaucho", 40, 6000, false);

        //  GUARDAR
        empleadosCRUD.guardar(Ariel);
        empleadosCRUD.guardar(Lionel);
        empleadosCRUD.guardar(Ronaldinho);

        System.out.println(Ariel);

        //  BUSCAR
        List<Empleados> empleado = empleadosCRUD.buscar();



    }
}
