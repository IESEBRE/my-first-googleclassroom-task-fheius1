package org.example;

import java.util.Scanner;

public class Avi{

    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);

        System.out.println("Com es diu lo primer avi?");
        String nom1= ent.next();


        System.out.println("I quants anys te?");
        int edat1= ent.nextInt();

        System.out.println("Com es diu lo segon avi?");
        String nom2 = ent.next();

        System.out.println("I quants anys te??");
        int edat2 = ent.nextInt();

        if (edat1 > edat2) System.out.println(nom1 + " te mes anys");
        else if (edat1 < edat2) System.out.println(nom2 + " te mes anys");
        else System.out.println("Tenen la mateixa edat");


    }
}
