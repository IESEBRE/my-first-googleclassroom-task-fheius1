package org.example;

import java.util.Scanner;

public class AnimalsJordina {

    public static void main(String[] args) {

        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            int numCasos = ent.nextInt();

            while(numCasos-->0){
                //Declaració de variables
                char numValors = ent.next()
                int[] valors = new int[numValors];
                int valorBuscat, nouValor;


                //LLegim els valors a guardar dins del vector
                for (int i = 0; i < valors.length; i++) {
                    valors[i] = ent.nextInt();
                }



                //Mostrem el canvi
                for (int i = 0; i < valors.length; i++) {
                    if( valors[i] == valorBuscat  ) System.out.print(nouValor);
                    else System.out.print(valors[i]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
