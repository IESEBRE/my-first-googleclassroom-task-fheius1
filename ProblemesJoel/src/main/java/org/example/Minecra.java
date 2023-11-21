package org.example;

import java.util.Scanner;

public class Minecra {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0){

            int linies = ent.nextInt();
            ent.nextLine();

            int totalDiamants = 0;

            for (int i = 0; i < linies; i++) {
                String corredor = ent.nextLine();

                int comptador = 0;
                int index = -1;

                while ((index = corredor.indexOf("{}", index + 1)) != -1) {
                    comptador++;
                }

                totalDiamants += comptador;
            }

            System.out.println(totalDiamants);
        }
    }
}
