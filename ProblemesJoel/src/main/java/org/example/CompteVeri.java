package org.example;

import java.util.Scanner;

public class CompteVeri {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        for (int i = 0; i < casos; i++) {
            int hp = ent.nextInt();
            int rammustorn = ent.nextInt();
            int twitchtorn = ent.nextInt();
            int torns = 0;

            while (hp > 0) {
                hp = hp - rammustorn;
                torns++;

                if (hp <= 0) {
                    System.out.println("RAMMUS " + torns);
                    break;
                }

                hp = hp - twitchtorn;

                if (hp <= 0) {

                    torns++;
                    System.out.println("TWITCH " + torns);
                    break;
                }
            }

        }

    }
}