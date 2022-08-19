package Practico;

public class reves {

    public static void main(String[] args) {

        String cadena = "Hola Mundo";
        System.out.println("El texto a invertir es: " + cadena);

        StringBuilder invertido = new StringBuilder(cadena);
        cadena = invertido.reverse().toString();
        System.out.println("El texto invertido es: " + cadena);
    }
}
