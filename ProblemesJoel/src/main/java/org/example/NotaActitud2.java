package org.example;

import java.util.Scanner;

public class NotaActitud2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos= ent.nextInt();

        while (numCasos-->1){
            //Tractament de casos
            int numNotes= ent.nextInt();
            int [] abans = new int[numNotes];
            int [] despres = new int[numNotes];

            
            //Llegim les notes abans de actitud
            for (int i = 0; i < abans.length ; i++) {
                abans[i] = ent.nextInt();
                
            }

            //Llegim les notes despres de actitud
            for (int i = 0; i < despres.length ; i++) {
                despres[i] = ent.nextInt();
            }

            int maxima=despres[0]-abans[0], comptador=1;
            for (int i = 1; i < abans.length; i++) {
                int diferencia = despres[i] - abans[i];
                if (diferencia>maxima) {
                    maxima=diferencia;
                    comptador=1;
                } else if (diferencia == maxima) {
                    comptador++;
                }
            }

            //Resultat
            System.out.printf("%d %d %n", maxima, comptador);

        }

    }

}



/*Amb 5 fors i 3 vecors
while (numCasos-->1){
        //Tractament de casos
        int numNotes= ent.nextInt();
        int [] abans = new int[numNotes];
        int [] despres = new int[numNotes];
        int [] diferencia = new int[numNotes];

        //Llegim les notes abans de actitud
        for (int i = 0; i < abans.length ; i++) {
        abans[i] = ent.nextInt();

        }

        //Llegim les notes despres de actitud
        for (int i = 0; i < despres.length ; i++) {
        despres[i] = ent.nextInt();
        }

        //Calcular diferencies entre notes
        for (int i = 0; i < diferencia.length; i++) {
        diferencia[i]= despres[i] -abans[i];
        }

        //Calcular nota maxima
        int maxima = diferencia[0];
        for (int i = 1; i < diferencia.length; i++) {
        if (diferencia[i]>maxima) maxima=diferencia[i];
        }

        //Quantitat d'alumnes que la tenen
        int comptador = 0;
        for (int i = 1; i < diferencia.length; i++) {
        if (diferencia[i]== maxima) comptador++;
        }

        //Resultat
        System.out.printf("%d %d %n" , maxima, comptador);

        }

        }

 */
