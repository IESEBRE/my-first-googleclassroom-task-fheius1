package org.example;

import java.util.Scanner;

public class Cadenes4 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Estas d'acord? s/n");
            String cadenares=  ent.nextLine().trim();

            if (cadenares.length()!=0 || !cadenares.isEmpty()) {
                resposta = cadenares.charAt(0);
                break;
            } else System.out.println("Has de contestar");
        } while (true);



        //char resposta = .charAt(0);

        if (resposta=='s' || resposta == 'S') System.out.println("Si");
        else System.out.println("No");

        resposta = ent.nextLine().toLowerCase().charAt(0);

        if (resposta=='s') System.out.println("Si");
        else System.out.println("No");
    }
}
