package org.example;

import java.util.Scanner;

public class PedraPaper {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int jugador1, jugador2;


        //1 pedra, 2 paper, 3 tisores
        jugador1 = ent.nextInt();
        jugador2 = ent.nextInt();

        if (jugador1 < 1 || jugador2 < 1 || jugador1 > 3 || jugador2 >3)
            System.out.println("ERROR");
         else if (jugador1 == jugador2) {
            System.out.println("EMPAT");
        } else if (jugador1 == 1 && jugador2 == 3) {
            System.out.println("Jugador1");
        } else if (jugador1 == 2 && jugador2 == 1) {
            System.out.println("Jugador1");
        } else if (jugador1 == 3 && jugador2 == 2) {
            System.out.println("Jugador1");

        } else if (jugador2 == 1 && jugador1 == 3) {
            System.out.println("Jugador2");
        } else if (jugador2 == 2 && jugador1 == 1) {
            System.out.println("Jugador2");
        } else if (jugador2 == 3 && jugador1 == 2) {
            System.out.println("Jugador2");
        }

    }


}