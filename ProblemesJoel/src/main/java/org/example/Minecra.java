package org.example;

import java.util.Scanner;

public class Minecra {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0){

            int corredors= ent.nextInt();
            int diamants= Integer.parseInt(ent.nextLine());
            int i = 0;
            int j = diamants.contains("{}", i);
            if (j == -1) break;
            System.out.println(j);
            i = j +1;
        }



    }
}