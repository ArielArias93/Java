package com.estructuras;

public class ForEach {

    public static void main(String[] args) {

        String[] nombres = {"Ariel", "Juan", "Lionel", "Neymar", "Jacinto", "Marcelo"};

        for(String nombre : nombres){

            System.out.println("El nombre es: " + nombre);
        }
    }
}
