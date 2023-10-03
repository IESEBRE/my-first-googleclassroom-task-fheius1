package org.example;

import java.util.Scanner;

public class Iguals {

    //Programa que demana la introduccio de 2 numeros i dir si son iguals
    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);

        int num1, num2;

        System.out.println("Escriu dos numeros");

        num1 = ent.nextInt();
        num2 = ent.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros son iguals");
        } else {
            System.out.println("Los numeros no son iguals");
        } if (num1 > num2){
            System.out.println("El numero " + num1 + " es mes gran que " + num2);
        } else {
            System.out.println("El numero " + num2 + " es mes gran que " + num1);
        }
    }
}
