package org.example;

import java.util.Scanner;

public class ContarNotes {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num1= 0;
        int comptarnumeros = 0; // en este cas comencem a comptar desde 0 i
        int valortotal=0;
        int  cE,cN, cB, cS, cI, cM;
        cE=cN= cB= cS= cI= cM= 0;

        while (num1 != -1){
            num1= ent.nextInt();

            if (num1 >= 0 && num1 <= 10){ // nomes sumo i compto els valors entre 0 i 10
                valortotal =valortotal + num1;
                comptarnumeros++;
                switch (num1){
                    case 10:
                    case 9:
                        cE++;
                        break;
                    case 8:
                    case 7:
                        cN++;
                        break;
                    case 6:
                        cB++;
                        break;
                    case 5:
                        cS++;
                        break;
                    case 4:
                        cI++;
                        break;
                    case 3:
                    case 2:
                    case 1:
                    case 0:
                        cM++;
                }

            }

        }

        System.out.println("NOTES: "+comptarnumeros+" MITJANA: "+((float)valortotal/comptarnumeros)+" E: "+cE +" N: "+cN+" B: "+cB+" S: "+cS+" I: "+cI+" MD: "+cM);
        //al ficar float entre parentesis estem fent un casting
        //per a que la divisio pugui donar amb decimal

       // System.out.format(" NOTES: %d MITJANA: %f E: %d N: %d B: %d S: %d I: %d MD: %d", comptarnumeros, (float)valortotal/comptarnumeros, cE, cN, cB, cS, cI, cM);

    }
}
