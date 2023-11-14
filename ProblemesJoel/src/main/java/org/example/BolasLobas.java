package org.example;

import java.util.Scanner;

public class BolasLobas {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            String paraula=ent.next();
            int num1 = ent.nextInt();
            int num2 = ent.nextInt();

            String paraulacanviada= new String();

            for (int i = 0; i < paraula.length(); i++) {
                if (i == num1){
                    System.out.print(paraula.charAt(num2));
                }else if (i == num2){
                    System.out.print(paraula.charAt(num1));
                } else paraula.charAt(i);
            }
            System.out.println();

        }

    }
}
