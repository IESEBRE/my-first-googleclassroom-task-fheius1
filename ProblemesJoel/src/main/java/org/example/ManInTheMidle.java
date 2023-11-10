package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ManInTheMidle {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        while (casos-- > 0) {

            int alumnes = entrada.nextInt();
            int forcaA = 0;
            int forcaB = 0;
            int[] forces = new int[alumnes];

            for (int i = 0; i < forces.length; i++) {
                forces[i] = entrada.nextInt();
            }
            Arrays.sort(forces);

            for (int i = forces.length - 1; i >= 1; i--) {
                if (forcaA <= forcaB) forcaA += forces[i];
                else forcaB += forces[i];
            }

            //Comprovar si el resultat es alterat amb lo man in the middle
            if (forcaA > forcaB) {          //Cas en el que l'equip a (forcaA) esta guanyant abans del man in the middle
                if (forcaB + forces[0] > forcaA) {
                    System.out.println("SI");            //Al afegir el man in the middle si que altera el resultat, guanyaria B
                } else {
                    System.out.println("NO");
                }
            } else {
                if (forcaA + forces[0] > forcaB) {
                    System.out.println("SI");           //Al afegir el man in the middle si que altera el resultat, guanyaria A
                } else {
                    System.out.println("NO");
                }
            }

        }
    }
}












/*package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ManInTheMiddle {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0){
            int alumnes = ent.nextInt();
            int[] matriu = new int[alumnes];
            int operacio = 0;
            int operacio2 = 0;

            for (int i = 0; i < alumnes; i++) {
                matriu[i] = ent.nextInt();
            }
            Arrays.sort(matriu);

            for (int i = 0; i < alumnes; i++) {
                if (operacio <= operacio2) {
                    operacio += matriu[i];
                    System.out.println("SI");
                } else {
                    operacio2 += matriu[i];
                    System.out.println("NO");
                }
            }
        }
    }
}


Versio alternativa

 Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {
            int alumnes = ent.nextInt();
            int[] matriu = new int[alumnes];
            int operacio = 0;
            int operacio2 = 0;

            for (int i = 0; i < alumnes; i++) {
                matriu[i] = ent.nextInt();
            }
            Arrays.sort(matriu);

            for (int i = 0; i < alumnes; i++) {
                if (operacio <= operacio2) {
                    operacio += matriu[i];
                } else {
                    operacio2 += matriu[i];
                }
            }

            int menor = matriu[0];
            if ((operacio - operacio2) <= menor) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }

        }

 */

