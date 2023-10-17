package org.example;

import java.util.Scanner;

import static java.lang.Math.abs;


public class Ascensor {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] dadesInici = ent.nextLine().split(" ");
        int minim = Integer.parseInt(dadesInici[0]);
        int maxim = Integer.parseInt(dadesInici[1]);
        int actual = Integer.parseInt(dadesInici[2]);

        int canvis = 0;
        int totals = 0;

        while (true) {
            String sortida = ent.nextLine();

            if (sortida.equals("X")) {
                break;
            }

            int desti = Integer.parseInt(sortida);

            if (desti >= minim && desti <= maxim) {
                canvis++;
                totals += abs(desti - actual);
                actual = desti;
            } else {
                System.out.println(canvis + " " + totals + " " + actual + " E");
                return;
            }
        }

        System.out.println(canvis + " " + totals + " " + actual);
    }
}
