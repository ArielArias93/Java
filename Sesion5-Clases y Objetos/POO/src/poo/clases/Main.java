package poo.clases;

import poo.herencia.Auto;
import poo.herencia.Camion;
import poo.herencia.Moto;

public class Main {

    public static void main(String[] args) {

        //  Clase identificador = new Clase();

        //Crear un objeto utilizando el constructor vacio
        Vehiculo vehiculo1 = new Vehiculo();


        //Crear un objeto utilizando el constructor con parametros

        Motor motor = new Motor(200, "Electrico");

        Vehiculo auto = new Vehiculo("Ford", "Focus", 2.0, 2022, true, 250, motor);

        System.out.println(auto.fabricante);
        System.out.println(auto.modelo);
        System.out.println(auto.cilindrada);
        System.out.println(auto.year);
        System.out.println(auto.sport);
        System.out.println(auto.motor.tipo);

       //   HERENCIA

        Moto moto = new Moto();

        moto.fabricante = "Kawasaki";
        moto.modelo = "K1";
        moto.cilindrada = 2.5;
        moto.year = 2018;
        moto.sport = true;

        //  POLIMORFISMO

        Vehiculo vehiculo;

        vehiculo = new Moto();
        vehiculo.acelerar(100);

        vehiculo = new Camion();
        vehiculo.acelerar(150);

        vehiculo = new Auto();
        vehiculo.acelerar(200);

        // CLASES ABSTRACTAS: NO SE PUEDEN INSTANCIAR, SOLO INSTANCIAN LAS CLASES HIJAS



    }
}
