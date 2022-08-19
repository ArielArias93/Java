package com.estructuras;

public class Switch {

    public static void main(String[] args) {

        String Dia = "Miercoles";

        switch (Dia){

            case "Lunes":
                System.out.println("Es lunes");
                break;
            case "Martes":
                System.out.println("Es martes");
                break;
            case "Miercoles":
                System.out.println("Es miercoles");
                break;
            case "Jueves":
                System.out.println("Es jueves");
                break;
            case "Viernes":
                System.out.println("Es viernes");
                break;
            case "Sabado":
                System.out.println("Es sabado");
                break;
            case "Domingo":
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Error en el dia ingresado");
        }
    }
}
