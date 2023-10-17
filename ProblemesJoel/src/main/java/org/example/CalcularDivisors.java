package org.example;

import java.util.Scanner;

public class CalcularDivisors {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos-- > 0){
            int num1 = ent.nextInt();
            int divisor = num1;
            int comptador = 0;
            while (divisor >= 1){
                if (num1  % divisor == 0){
                    comptador++;
                }
                divisor--;
            }

            System.out.println(comptador==2 ? "Si" : "No");


        }
    }
}


/*    Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        while (casos-- > 0){
            int num1 = ent.nextInt();
            int divisor = num1;
            while (divisor >= 1){
                if (num1  % divisor == 0) System.out.printf("%d ", divisor);
                divisor--;
            }
        }
    }

 */

/*Versio per a dir si un numero es prim o no
   Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        while (casos-- > 0){
            int num1 = ent.nextInt();
            int divisor = num1;
            int comptador = 0;
            while (divisor >= 1){
                if (num1  % divisor == 0){
                    comptador++;
                }
                divisor--;
            }
            System.out.println(comptador==2 ? "Si" : "No");

        }
    }
 */
