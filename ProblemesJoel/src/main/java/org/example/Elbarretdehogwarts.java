package org.example;

import java.util.Scanner;

public class Elbarretdehogwarts {

    public static void main(String[] args) {

        System.out.println("Què és el més important per a tu? De la teva resposta dependrà la teva casa.");
        Scanner ent = new Scanner(System.in);
        String resposta;
        resposta = ent.nextLine();

        /*if (resposta.equals("Coratge")){
            System.out.println("Gryffindor");
        } else if (resposta.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (resposta.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else System.out.println("Hufflepuff"); */
        switch (resposta) {
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");

        }
    }

}
