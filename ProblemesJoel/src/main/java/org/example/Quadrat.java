package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Quadrat {


    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            int dimensions= ent.nextInt();
            int [][] matriu = new int[dimensions][dimensions]; //matriu resultat , inicialment plena amb 0
            int valor= 1;

            //Fer que l'1 vaigi al mitg de la primera fila
            int i=0, j= dimensions/2;
            matriu[i][j]= valor++;

            while (valor<=dimensions*dimensions){

                //Calcular la nova posicio
                i--;
                if (i ==-1) i = dimensions-1;
                j--;
                if (j ==-1) i = dimensions-1;

                //Ficar el valor a la nova casella calculada
                if (matriu[i][j]==0) matriu[i][j]= valor++;



            }

            for (int k = 0; k < matriu.length; k++) {
                for (int l = 0; l < matriu.length; l++) {
                    System.out.printf("%d", matriu[k][l]);

                }
                System.out.println();
                
            }

            System.out.println();

        }


    }
}

/*Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            int salts= Integer.parseInt(ent.skip("[\r\n]*").nextLine());
            String frase= ent.skip("[\r\n]*").nextLine();
            String extret="", resto="";
            for (int i = 0; i < frase.length(); i++) {
                if ((i+1)% (salts+1)==0) extret+=frase.charAt(i);
                else resto+=frase.charAt(i);
            }

        }

 */