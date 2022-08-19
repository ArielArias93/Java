package ClasesYObjetos;

public class Main {

    public static void main(String[] args) {

        SmartDevices smart = new SmartDevices();

        SmartPhone celular = new SmartPhone();

        celular.marca = "Samsung";
        celular.modelo = "S20";
        celular.color = "Negro";
        celular.peso = 255.5;

        celular.altaGama = true;
        celular.linea = "Claro";
        celular.pulgadas = 6.5;

        System.out.println("Marca del SmartPhone: " + celular.marca);
        System.out.println("Modelo del SmartPhone: " + celular.modelo);
        System.out.println("Color del SmartPhone: " + celular.color);
        System.out.println("Peso en gramos: " + celular.peso);
        System.out.println("Es de alta gama?: " + celular.altaGama);
        System.out.println("Linea del SmartPhone: " + celular.linea);
        System.out.println("Pulgadas de pantalla: " + celular.pulgadas);


        SmartWatch reloj = new SmartWatch();

        reloj.marca = "LG";
        reloj.modelo = "A4";
        reloj.color = "Blanco";
        reloj.peso = 15.0;

        reloj.duracionBateria = 76;
        reloj.sumergible = true;

        System.out.println("\nMarca del reloj: " + reloj.marca);
        System.out.println("Modelo del reloj: " + reloj.modelo);
        System.out.println("Color del reloj: " + reloj.color);
        System.out.println("Peso en gramos: " + reloj.peso);

        System.out.println("Horas de duracion de bateria: " + reloj.duracionBateria);
        System.out.println("Es sumergible?: " + reloj.sumergible);

    }
}
