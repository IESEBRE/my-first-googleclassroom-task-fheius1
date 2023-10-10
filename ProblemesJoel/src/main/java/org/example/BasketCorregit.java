package org.example;

import java.util.Scanner;

public class BasketCorregit {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int numcasos = ent.nextInt();
        int puntslocal = 0;
        int puntsvisitant = 0;

        while (numcasos-->0) {  //Lo --> serveix per anar decrementant los casos

            int numcistella = ent.nextInt();

            while (numcistella-->0){
                String cistella = ent.next();
                String equip = cistella;
                int puntos = Integer.parseInt(cistella);

                if (equip.equals("L")) {
                    puntslocal = ++puntos;
                } else {
                    puntsvisitant = ++puntos;
                }

                char guanyador;
                if (puntslocal > puntsvisitant) {
                    guanyador = 'L';
                } else if (puntslocal < puntsvisitant) {
                    guanyador = 'V';
                } else {
                    guanyador = 'E';
                }
            }

            System.out.printf("%d ");

        }
    }
}
