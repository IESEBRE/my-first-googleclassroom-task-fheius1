package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        int nebots, caramels;

        nebots = ent.nextInt();
        caramels = ent.nextInt();

        System.out.println(caramels % nebots);

    }
}