package ClasesYObjetos;

public class SmartPhone extends SmartDevices{

    double pulgadas;
    String linea;
    boolean altaGama;

    public SmartPhone() {}

    public SmartPhone(double pulgadas, String linea, boolean altaGama) {
        this.pulgadas = pulgadas;
        this.linea = linea;
        this.altaGama = altaGama;
    }
}
