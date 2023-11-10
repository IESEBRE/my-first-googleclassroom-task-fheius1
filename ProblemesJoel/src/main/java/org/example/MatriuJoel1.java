package org.example;

import java.util.Scanner;
public class MatriuJoel1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numerof = ent.nextInt();
        int numeroc = ent.nextInt();
        int[][] matriu = new int[numerof][numeroc];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        int numeroi = ent.nextInt();
        int numeroj = ent.nextInt();
        System.out.println(matriu[numeroi][numeroj]);
    }
}
