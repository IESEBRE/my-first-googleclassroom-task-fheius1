package org.example;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        while (num2 <= num1) {

            while (num2 <= num1){
                System.out.println(num1);
                num1 = num1 - 1;
            }


        }
        if (num2 > num1) System.out.println("El segon numero no es mes petit que el primer");


    }
}
