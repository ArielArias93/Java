package Practico;

import java.io.*;

public class InOut {

    public static void main(String[] args) {

            try {

                InputStream filein = new FileInputStream("C:\\Users\\Usser\\Documents\\BootCamp\\Curso-Java\\Sesion9-Ficheros\\PracticoFicheros\\ficherito.txt");
                byte []datos = filein.readAllBytes();

                PrintStream fileout = new PrintStream("ficherito2.txt");
                fileout.write(datos);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
}
