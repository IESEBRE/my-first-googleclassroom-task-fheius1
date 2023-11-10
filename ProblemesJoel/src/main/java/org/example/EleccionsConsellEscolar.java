package org.example;

import java.util.Scanner;

public class EleccionsConsellEscolar {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt();
        char[][] matriu = new char[n][n];


       for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (i==0 || i== matriu.length-1 || j==0 || j == matriu.length-1 || i ==j) matriu[i][j]="X";
                else matriu[i][j]='.';
                System.out.println(matriu[i][j]);
            }
            System.out.println();
        }
    }
}














    

/*
 scanner.close();

        if (n <= 0) {
            System.out.println("Ha de ser un nombre positiu.");
            ;
        }

        // Crear una matriu quadrada de mida 'n x n'
        char[][] matriu = new char[n][n];

        // Omplir la matriu amb espais buits inicialment
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = '.';
            }
        }

        // Omplir les vores i les diagonals
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    matriu[i][j] = 'X';
                }
            }
        }

        // Imprimir la matriu
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriu[i][j]);
            }
            System.out.println();

 */
