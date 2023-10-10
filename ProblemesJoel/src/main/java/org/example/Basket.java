package org.example;

import java.util.Scanner;

public class Basket {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);


        int numcasos = scanner.nextInt();
        scanner.nextLine();

        while (numcasos --> 0) {
            int numcistella = scanner.nextInt();
            scanner.nextLine();

            int puntslocal = 0;
            int puntsvisitant = 0;

            while (numcistella-- > 0) {
                String[] cistella = scanner.nextLine().split(" ");
                String equip = cistella[0];
                int puntos = Integer.parseInt(cistella[1]);

                if (equip.equals("L")) {
                    puntslocal = ++puntos;
                } else {
                    puntsvisitant = ++puntos;
                }
            }

            char guanyador;
            if (puntslocal > puntsvisitant) {
                guanyador = 'L';
            } else if (puntslocal < puntsvisitant) {
                guanyador = 'V';
            } else {
                guanyador = 'E';
            }

            System.out.println(guanyador + " " + puntslocal + " " + puntsvisitant);
        }


    }

}