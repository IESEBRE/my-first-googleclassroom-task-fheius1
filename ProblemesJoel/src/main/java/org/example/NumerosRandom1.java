package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumerosRandom1 {

    public static void main(String[] args) {

        Scanner ent= new Scanner(System.in);
        Random r = new Random();
        System.out.println("Fica un numero");
        int numero1 = ent.nextInt();
        int [] comptador = new int['Z'-'A'+1];

       do {
            if (numero1 <= 0){
                System.out.println("Ha de ser un numero positiu");
            }
           break;

       } while (true);
        for (int i = 0; i < numero1; i++) {
            char c =(char) (r.nextInt('Z'-'A'+1)+'A'); //lletra generada
            comptador [c -'A'] = comptador [c -'A'] +1;
            System.out.printf("%c",c);
        }
        System.out.println();

        for (int i = 0; i < comptador.length; i++) {
            if (comptador[i] != 0){
                System.out.printf("El caràcter %c ha sortit %d vegades.%n",i + 'A', comptador[i]);
            }
            
        }
    }
}