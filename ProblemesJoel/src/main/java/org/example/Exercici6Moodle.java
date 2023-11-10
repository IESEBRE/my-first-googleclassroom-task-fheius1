package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici6Moodle {

    public static void main(String[] args) {


        //Declaracio de constants
        final int QUANTITAT =4;

        //Comprovar que la quantitat es positiva
        if (QUANTITAT <= 0){
            System.out.println("Hi ha un error, parla amb el que ha programat");
            System.exit(-1);
        }

        Scanner ent = new Scanner(System.in);
        int [] vector= new int[QUANTITAT];


        System.out.println("Introdueix 2 valors enters ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = ent.nextInt();

        }

        //Despres de llegir i sumar calculem la mitjana
        Arrays.sort(vector);
        double mediana;

        //Per trobar la mediana combrobem la dimensio del vector
        if (vector.length % 2 == 0) mediana =(vector[QUANTITAT/2]+ vector[(QUANTITAT/2)-1])/2.0;
        else mediana= vector[QUANTITAT/2];

        //Mostrar valors
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= mediana) System.out.println(vector[i]);
        }



    }
}
