package org.example;

import java.util.Scanner;

public class Caracoles {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int avantN= ent.nextInt();
        int detrasN= ent.nextInt();
        int posN= 1;
        int posB = 1;
        int comptParcPassosN, comptParcPassosB;
        posN=posB=comptParcPassosN=comptParcPassosB=1;

        //Variables per a controlar on caminen els npc
        boolean caminaAvantN=true, caminaAvantB=true;

        int pasos = ent.nextInt();
        while (pasos-- > 0) {

            if (caminaAvantN){
                posN++;
                comptParcPassosN++;
                if (comptParcPassosN==avantN){
                    caminaAvantN= false;
                    comptParcPassosN = 0;
                } else {
                    posN--;
                    comptParcPassosN++;
                    if (comptParcPassosN==detrasN){
                        caminaAvantN = true;
                        comptParcPassosN= 0;
                    }
                }

            }

        }
    }
}
