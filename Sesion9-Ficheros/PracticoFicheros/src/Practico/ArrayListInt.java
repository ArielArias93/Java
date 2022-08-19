package Practico;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt {

    public static void main(String[] args) {

        ArrayList<Integer> listaNum = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingresa un numero: ");
            listaNum.add(scanner.nextInt());

        }

        for (int i = 0; i < listaNum.size(); i++) {

            if (listaNum.get(i) % 2 == 0) {

                listaNum.remove(i);
            }
        }

        System.out.println("\n" + "La lista con los numeros pares eliminados es: ");

       for (Integer listaMostrar : listaNum) {

            System.out.println(listaMostrar);
        }

    }
}
