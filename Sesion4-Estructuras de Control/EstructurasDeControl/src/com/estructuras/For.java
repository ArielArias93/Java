package com.estructuras;

public class For {

    public static void main(String[] args) {

        for (int i = 0; i <10; i++){

            System.out.println("el valor de i es: " + i);
        }

        String[] nombres = {"Ariel", "Juan", "Lionel", "Neymar", "Jacinto", "Marcelo"};

        for (int i = 0; i<nombres.length ; i++){

            System.out.println("El nombre es: " + nombres[i]);
        }
    }
}
