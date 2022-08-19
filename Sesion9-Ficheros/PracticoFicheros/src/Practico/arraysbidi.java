package Practico;

public class arraysbidi {

    public static void main(String[] args) {

        String arraybi[][] = {

                { "Hola", "Chau", "Adios", "Mucho Gusto"},
                { "Auto", "Moto", "Camion", "Bicicleta"}
        };

        for (int i = 0; i < arraybi.length; i++){

            for (int j = 0; j < arraybi[1].length; j++){

                System.out.println("Estoy en la fila: " + i + "\n" + "En la columna: " +j);

                System.out.println("La palabra en la posicion es: " + arraybi[i][j] + "\n");
            }
        }
    }
}
