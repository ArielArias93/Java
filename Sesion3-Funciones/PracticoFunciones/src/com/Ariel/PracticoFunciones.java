package com.Ariel;

public class PracticoFunciones {


        public static void main(String[] args) {

            double precioImp = PrecioMasIva(20);

            System.out.println("El precio con el IVA incluido es: " + precioImp);

        }

        private static double PrecioMasIva(double precio){

            double iva = 5.99;

            return precio + iva;
        }
    }
