package Practico;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Ariel");
        lista.add("Lionel");
        lista.add("Neymar");
        lista.add("Lucho");

        LinkedList<String> listaMostrar = new LinkedList<String>(lista);

        for (String listanomb : listaMostrar) {
            System.out.println(listanomb);
        }

        for (String nomLista : lista) {
            System.out.println(nomLista);
        }
    }
}