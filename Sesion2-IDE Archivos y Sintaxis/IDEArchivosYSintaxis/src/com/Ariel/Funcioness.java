package com.Ariel;

public class Funcioness {

    public static void main(String[] args) {

        //opcion 1: funcion sin parametros y sin tipo de retorno
        ShowMenu();

        //opcion 2: funcion sin parametros y con tipo de retorno

        String Menu = getMenu();
        System.out.println(Menu);

        //opcion 3: funcion con parametros y sin tipo de retorno

        Saludar("Hola Buenos dias!");

        //Opcion 4: funciones con parametros y con tipo de retorno
    }

    private static void Saludar(String saludo) {

        System.out.println(saludo);
    }

    private static void ShowMenu() {  //Void indica que no devuelve nada!
        System.out.println("Bienvenido a E-Comerce");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar zapatilla");
        System.out.println("3- Salir");
    }

    private static String getMenu(){

        return "Bienvenido a E-Comerce \n 1- Ver zapatillas \n 2- Comprar zapatilla \n 3- Salir";

    }
}


