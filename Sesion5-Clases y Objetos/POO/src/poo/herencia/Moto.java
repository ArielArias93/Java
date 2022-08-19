package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Moto extends Vehiculo {

    boolean baul;

    public Moto(){}

    public Moto(String fabricante, String modelo, double cilindrada, int year, boolean sport, int velocidad, Motor motor, boolean baul) {

        super(fabricante, modelo, cilindrada, year, sport, velocidad, motor);
        this.baul = baul;
    }
}
