package org.example;

import java.util.Scanner;

public class MatriuIdentitat {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int numero = ent.nextInt();

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if ( i == j) {
                    System.out.print("1 ");
                }  else System.out.print(0 + " ");
            }
            System.out.println();

        }
    }
}

