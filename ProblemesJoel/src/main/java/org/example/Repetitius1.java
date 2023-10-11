package org.example;

import java.util.Scanner;

public class Repetitius1 {

    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);
        int valor;
        valor = 1;

        /*while (valor != 0) {
            System.out.println("Introdueix un valor");
            valor = ent.nextInt();
        }*/

        do {
            System.out.println("Introdueix un valor");
            valor = ent.nextInt();

        }while (valor != 0);



    }
}


/*Estructura do basica
do {

        } while (condicio_true)*/

