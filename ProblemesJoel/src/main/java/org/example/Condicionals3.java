package org.example;

import java.util.Scanner;

public class Condicionals3 {

    public static void main(String[] args) {

        //Nova esr¡tructura condicional: switch

        Scanner ent = new Scanner(System.in);
        int dia;
        System.out.println("Escriu un dia lectiu de la setmana");
        dia = ent.nextInt();


         switch (dia) {
            case 1:
                System.out.println("Este dia es DilUnS");
                break;
            case 2:
                System.out.println("Este dia es Dimarts");
                break;
            case 3:
                System.out.println("Este dia es Dimecres");
                break;
            case 4:
                System.out.println("Este dia es Dijous");
                break;
            case 5:
                System.out.println("Este dia es Divendres");
                break;
            default:
                if ( dia == 6 || dia == 7) System.out.println("Es finde");
                else System.out.println("Este dia no es valid");
        }

    }
}
