package sinInterfaces;

public class Empleados {

    //  ATRIBUTOS
    String nombre;
    String apellido;
    int edad;
    double salario;
    boolean alta;

    //  CONSTRUCTORES


    public Empleados() {}

    public Empleados(String nombre, String apellido, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    //  METODOS


    @Override

    public String toString() {

        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
