import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int resultado = numero1 / numero2;

        System.out.println("El resultado es: " + resultado);
    }
}
