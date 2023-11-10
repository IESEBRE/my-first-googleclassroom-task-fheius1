package org.example;

import java.util.Scanner;

public class Exercici5Moodle {

    public static void main(String[] args) {


        //Declaracio de constants
        final int QUANTITAT =2;

        //Comprovar que la quantitat es positiva
        if (QUANTITAT <= 0){
            System.out.println("Hi ha un error, parla amb el que ha programat");
            System.exit(-1);
        }

        Scanner ent = new Scanner(System.in);
        int [] vector= new int[QUANTITAT];
        int suma = 0;

        System.out.println("Introdueix un valor enter ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = ent.nextInt();
            //Acumulem la suma
            suma = suma + vector[i];
        }

        //Despres de llegir i sumar calculem la mitjana
        double mitjana = (double) suma / QUANTITAT;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= mitjana) System.out.println(vector[i]);
        }

    }
}
