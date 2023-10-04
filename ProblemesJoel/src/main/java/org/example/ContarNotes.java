package org.example;

import java.util.Scanner;

public class ContarNotes {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num1= ent.nextInt();
        int comptarnumeros = 0; // en este cas comencem a comptar desde 0 i
        int valortotal=0;
        int  cE,cN, cB, cS, cI, cM;
        cE=cN= cB= cS= cI= cM= 0;

        while (num1 != -1){

            if (num1 >= 0 && num1 <= 10){ // nomes sumo i compto els valors entre 0 i 10
                valortotal =valortotal + num1;
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
                }
                comptarnumeros++;
            }
            num1= ent.nextInt();


        }
        System.out.println();

    }
}
