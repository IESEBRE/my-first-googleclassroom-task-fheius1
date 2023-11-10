package org.example;
import java.util.Scanner;
public class MatriuJoel2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numerof = ent.nextInt();
        int numeroc = ent.nextInt();
        int[][] matriu = new int[numerof][numeroc];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }
        int numeroi = ent.nextInt();
        int numeroj = ent.nextInt();
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (matriu[i][j] == numeroi) matriu[i][j] = numeroj;
                System.out.printf("%d ", matriu[i][j]);
            }
            System.out.println();
        }
    }
}




/* Versio amb condicional


 Scanner ent = new Scanner(System.in);
        int numerof = ent.nextInt();
        int numeroc = ent.nextInt();
        int[][] matriu = new int[numerof][numeroc];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }
        int numeroi = ent.nextInt();
        int numeroj = ent.nextInt();
         for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%d ", matriu[i][j]== numeroi ? numeroj: matriu[i][j]);
            }
            System.out.println();
        }


 */
