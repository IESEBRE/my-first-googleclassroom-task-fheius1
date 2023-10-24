package org.example;

import java.util.Scanner;

public class ProvesBucles {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduieix un numero positiu");
        int num1 = ent.nextInt();
        char lletra='A';

        do {

            if (num1 > 0) break;
            else System.out.println("Fica un numero valid");

        } while (true);

        for (int i = 0; i < num1; i++){
            for (int j = 0 ; j < num1; j++){
                if (Character.isLetter(lletra)) System.out.printf("%c", lletra);
                else j--;
                if (lletra =='z')lletra='a';
                lletra++;
            }
            System.out.println();

        }

        }

}




/*
int num1;



        do {
            System.out.println("Introduieix un numero positiu");
            int num1 = ent.nextInt();
            if (num1 > 0) break;
            else System.out.println("Fica un numero valid");

        } while (true);

                for (int i = 1; i <= num1; i++) {
                    for (int j = num1-i; j >= 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }

        System.out.println();

        for (int i = num1; i >= 1; i--) {
            for (int j = num1-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

 */


/* Bucle Simple
 public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();

       for (int i= 1; i<=num1 ; i++){
           for (int j =1; j<= i ; j++){
               System.out.println(i);
           }
       }
        System.out.println();

    }
 */



/*Bucle per a dibuix a la esquerra

 Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();


                for (int i = 1; i <= num1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }

        for (int i = num1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

 */

/*Dibuix a la dreta
 Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();


                for (int i = 1; i <= num1; i++) {
                    for (int j = num1-i; j >= 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println();
                }

        for (int i = num1; i >= 1; i--) {
            for (int j = num1-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
 */