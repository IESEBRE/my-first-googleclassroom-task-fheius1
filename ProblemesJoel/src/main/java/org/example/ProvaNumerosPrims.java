package org.example;

import java.util.Scanner;

public class ProvaNumerosPrims {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Fca un numero");
        int casos = ent.nextInt();
        int tractament = 1;

        while (tractament <= casos){
            int divisor = 1;
            int comptador = 0;
            while (divisor <= tractament){
                if (tractament  % divisor == 0){
                    comptador++;
                }if (comptador>2){
                    break;
                }
                divisor++;
            }

            System.out.println(tractament + (comptador==2 ? "Si" : "No"));
            tractament++;

        }
    }
}