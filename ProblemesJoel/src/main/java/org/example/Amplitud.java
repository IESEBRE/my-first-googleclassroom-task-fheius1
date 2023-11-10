package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Amplitud {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {
            int medicions = ent.nextInt();
            int[] matriu = new int[medicions];

            for (int i = 0; i < matriu.length; i++) {
                matriu[i] = ent.nextInt();
            }
            Arrays.sort(matriu);

            for (int i = 0; i < matriu.length/2; i++) {
                if (matriu.length%2 == 0){
                    System.out.printf("%d %d ", matriu[(matriu.length/2)-1-i], matriu[(matriu.length/2)+i]);
                } else {
                    System.out.printf("%d %d ", matriu[(matriu.length/2)-i], matriu[(matriu.length/2)+1+i]);
                }
            }
            if (matriu.length%2 == 0) System.out.println();
            else System.out.println(matriu[0]);
        }
    }
}