package org.example;

public class Bucles1 {

    public static void main(String[] args) {

        //Sintaxis del while
        /*while (condicio){
            instruccio
        }*/


        //mostrem del 1 al 2 , no cal bucle
        System.out.println(1);
        System.out.println(2);

        // del 1 al 1000, pots utilitzar 100 sout o fer un bucle

        int num1= 1;
        while (num1 <= 1000){ // la condicio al inici te que ser true pero acabar en false per a no ser un bucle infinit
            System.out.println(num1);
            num1= num1+10;
        }


        //bucle infinit
        // while (true) {
        // if (false) break
        // }
    }
}
