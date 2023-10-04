package org.example;

import java.util.Scanner;

public class ElonBucle {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        while (num1 >= 0) { // la condicio al inici te que ser true pero acabar en false per a no ser un bucle infinit
            System.out.println(num1);
            num1 = num1 - 1;


             /* fer-ho amb una sola linea
                System.out.println(num1--); ja que primer mostra lo numero i despres decrementa
             */

            /*Ampliacio per a que pari en quant fica -1
            Scanner ent= new Scanner(System.in);
            int num1= ent.nextInt();
            while (num1 != -1){
            num1= ent.nextInt();
             */


            /* Ampliacio

            int num1= ent.nextInt();
            int comptarnumeros = 0; // en este cas comencem a comptar desde 0 i
            int valortotal= 0;      //  a sumar desde 0 ja que hu farem despres en el if

            while (num1 != -1){

            if (num1 >= 0 && num1 <= 10){ // nomes sumo i compto els valors entre 0 i 10
                valortotal= valortotal + num1;
                comptarnumeros++;
            }
            num1= ent.nextInt();


            }
            System.out.println(valortotal);

             */
        }
    }

}
