package org.example;

import java.util.Scanner;

public class MaximMatriu {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0){

            int numerof = ent.nextInt();
            int numeroc = ent.nextInt();
            int maxim=0, imax=0, jmax=0 ;
            int[][] matriu = new int[numerof][numeroc];
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu [i] [j] = ent.nextInt();
                    if (i == 0 && j ==0){
                        maxim= matriu[0][0];
                        imax=0;
                        jmax=0;
                    }else if (matriu [i][j]>= maxim) {
                        maxim = matriu[i][j];
                        imax = i;
                        jmax=j;
                    }
                }
            }
            //mostrar la posicio user-frindly (per a un usuari) del valor maxim
            System.out.printf("%d %d %n", imax+1, jmax+1);

        }
    }

}



/*Versio funcional

        Scanner ent = new Scanner(System.in);
         int casos = ent.nextInt();

         while (casos-- > 0){

             int numerof = ent.nextInt();
             int numeroc = ent.nextInt();
             int maxim= Integer.MIN_VALUE, imax =0, jmax=0;
             int[][] matriu = new int[numerof][numeroc];
             for (int i = 0; i < matriu.length; i++) {
                 for (int j = 0; j < matriu[i].length; j++) {
                     matriu [i] [j] = ent.nextInt();
                     if (matriu [i][j]>= maxim) {
                         maxim = matriu[i][j];
                         imax = i;
                         jmax=j;
                     }
                 }
             }
             //mostrar la posicio user-frindly (per a un usuari) del valor maxim

             System.out.printf("%d %d %n", imax+1, jmax+1);
         }

    }

 */


/*

 */


/*
Scanner ent = new Scanner(System.in);
         int casos = ent.nextInt();

         while (casos-- > 0){

             int numerof = ent.nextInt();
             int numeroc = ent.nextInt();
             int maxim=0, imax=0, jmax=0 ;
             int[][] matriu = new int[numerof][numeroc];
             for (int i = 0; i < matriu.length; i++) {
                 for (int j = 0; j < matriu[i].length; j++) {
                     matriu [i] [j] = ent.nextInt();
                     if (i == 0 && j ==0){
                         maxim= matriu[0][0];
                         imax=0;
                         jmax=0;
                     }else if (matriu [i][j]>= maxim) {
                         maxim = matriu[i][j];
                         imax = i;
                         jmax=j;
                     }
                 }
             }
             //mostrar la posicio user-frindly (per a un usuari) del valor maxim
             System.out.printf("%d %d %n", imax+1, jmax+1);

         }

 */
