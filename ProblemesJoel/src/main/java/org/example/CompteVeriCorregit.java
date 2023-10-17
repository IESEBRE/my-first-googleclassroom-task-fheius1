package org.example;

import java.util.Scanner;

public class CompteVeriCorregit {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos-- > 0){
            //Tractament de casos dins del bucle
            int vida = ent.nextInt();
            int rammus = ent.nextInt();
            int twitch = ent.nextInt();
            int rondes = 0;

            while (true){
                rondes++;
                vida = vida - rammus;
                if (vida <= 0) {
                    System.out.printf("%s %d %n", "RAMMUS", rondes);
                    break;
                } else {
                    vida = vida - twitch;
                    if (vida <= 0) {
                        System.out.printf("%s %d %n", "TWITCH", rondes);
                        break;
                    }
                }



            }
        }
    }
}


/*metode amb lo print format
 if (vida <= 0) {
                    System.out.printf("%s %d %n", "RAMMUS", rondes);
                    break;
                } else {
                    vida = vida - twitch;
                    if (vida <= 0) {
                        System.out.printf("%s %d %n", "TWITCH", rondes);
                        break;
                    }
                }
 */