package org.example;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.SortedMap;

public class Exercici11 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int [][] matriu;
        int valor = 1;
        int n;

        do {
            System.out.println("Introdueix dimensio");
            n = ent.nextInt();
            if (n<1) System.out.println("Ha de ser mes gran que 0");
            else break;
        } while (true);

        //Ja es po instanciar la matriu
        matriu = new int[n][n+1];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=valor++;
                System.out.println(matriu[i][j]+"");
            }

            System.out.println();
            
        }
    }
}
