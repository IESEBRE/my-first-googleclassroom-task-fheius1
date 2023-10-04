package org.example;

import java.util.Scanner;

public class Exercici1Moodle {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        System.out.println("Introdueix dos numeros");
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int valormesgran = 0;

        while (num1 <= num2) {
            if (num1 > num2) {
                valormesgran= num1;
                num1 = num2;
                num2=num1;
            }
            System.out.println(num1 % 2 == 0 ? num1 + " es parell" : num1 + " es imparell"); //Utilitzant lo metode ternari
            num1 = num1 + 1;

        }
    }
}




/*Mostrar una serie de numeros i di si es parell o imparell
int num1 = -50;
while (num1 <=50) {
System.out.println(num1 % 2 == 0 ? num1 + " es parell" : num1 + " es imparell"); //Utilitzant lo metode ternari
num1 = num1 + 1;
}
 */




/*Fer que l'usuari demani dos numeros en ordre creixent i dir quins son parells i imparells
   Scanner ent = new Scanner(System.in);
System.out.println("Introdueix dos numeros");
int num1 = ent.nextInt();
int num2 = ent.nextInt();
while (num1 <= num2) {
System.out.println(num1 % 2 == 0 ? num1 + " es parell" : num1 + " es imparell"); //Utilitzant lo metode ternari
num1 = num1 + 1;
}
}
 */


/*Fer que l'usuari demani dos numeros en qualsevol ordre i dir quins son parells i imparells

 */