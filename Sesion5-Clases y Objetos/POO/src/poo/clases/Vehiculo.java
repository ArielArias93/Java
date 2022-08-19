package poo.clases;

public class Vehiculo {

    //   ATRIBUTOS
    protected String fabricante;
    protected String modelo;
    protected double cilindrada;
    protected int year;
    protected boolean sport;
    protected int velocidad;
    Motor motor;

    //  CONSTRUCTORES

    public Vehiculo(){}

    public Vehiculo(String fabricante, String modelo, double cilindrada, int year, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.year = year;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    //  METODOS

    public void acelerar(int aceleracion){

        this.velocidad += aceleracion;
    }

}
