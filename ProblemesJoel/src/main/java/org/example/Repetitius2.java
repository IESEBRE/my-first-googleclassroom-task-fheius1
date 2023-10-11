package org.example;

import java.util.Scanner;

public class Repetitius2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int valor;

        valor = ent.nextInt();

        do {
            System.out.println("Introdueix un valor positiu");
            valor = ent.nextInt();
            if (valor > 0) break;
            else System.out.println("Ha de ser positiu");
        }while (true);
    }
}

