package org.example;

import java.util.Scanner;

public class Parelles {

    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int num3 = ent.nextInt();


        if (num1 == num2  || num2 == num3 || num1 == num3) System.out.println("SI");
        else System.out.println("NO");

       // Amb operador ternari

        //System.out.println(num1 == num2  || num2 == num3 || num1 == num3 ? "Si":"No");

    }
}