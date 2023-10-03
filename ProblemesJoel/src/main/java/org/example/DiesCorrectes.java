package org.example;

import java.util.Scanner;

public class DiesCorrectes {
        public static void main(String[] args) {


            Scanner ent = new Scanner(System.in);
            int dia = ent.nextInt();
            int any = ent.nextInt();


            if (dia >=1 && dia<366) System.out.println("Correcte per un any no bixest!");
            else if (dia == 366 || any % 4 == 0 && any % 100 != 0 || any % 400 == 0) System.out.println("Correcte per un any bixest!");
            else System.out.println("Incorrecte!");


            // Ampliacio: programa que demana un numero de dia de l'any i un numero d'any i mostra per pantalla,
            //Correcte: si el dia esta entre 1 i 365 i l'any no es bixest, o si el es 366 i l'any es bixest
            //Incorrecte: en qualsevol altre cas

        }

}