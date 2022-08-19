package practicoInterfaces;

public class Coche {

    String fabricante;
    String modelo;
    int year;
    double valor;
    boolean automatico;

    public Coche() {
    }

    public Coche(String fabricante, String modelo, int year, double valor, boolean automatico) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.valor = valor;
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Fabricante='" + fabricante + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Year=" + year +
                ", Valor=" + valor +
                ", Automatico=" + automatico +
                '}';
    }
}
