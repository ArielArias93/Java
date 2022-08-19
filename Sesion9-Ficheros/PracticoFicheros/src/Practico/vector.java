package Practico;

import java.util.Vector;

public class vector {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(5, 10);

            vector.add(5);
            vector.add(6);
            vector.add(9);
            vector.add(12);
            vector.add(18);

            System.out.println("Los datos almacenados en el vector son: " + vector);

            vector.remove(1);
            vector.remove(1);

            System.out.println("Los datos almacenados en el vector son: " + vector);
    }
}


/* 4- Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

      El problema es que que si se pretende guardar un número grande de elementos se tiene que especificar el incremento de la capacidad del vector,
      si no se quiere desperdiciar inútilmente la memoria el ordenador.
 */