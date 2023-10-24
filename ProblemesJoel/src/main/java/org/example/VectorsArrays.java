package org.example;

import java.util.Scanner;

public class VectorsArrays {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        int a;
       //Variables tipo vector

        int[] vector;
        char[] vectorlletres;
        boolean[] respostes;
        String[] frases;
        Scanner[] entrades;

        //Declarar i inanciacio al mateix temps, en este cas no a falta ficar el new
        int[] diesmes = {31,28,31,30,31,30,31,31,30,31,30,31};

        //Instanciacio de vectors
        vector= new int[300];    //vector de 34 caselles de tipo int enter
        vectorlletres= new char[] {'H','O','L','A',' '};


        //Acces a les caselles
        vectorlletres[0]= 'h';
        System.out.println(vectorlletres[0]);

        /*Recorregut de vector
        for (int i = 0; i < vectorlletres.length;i++);{
            System.out.println(vectorlletres[i]);
        }

         */

        //Instanciem un vector en temps d'execucio
        System.out.println("Quants valors vols");
        a=ent.nextInt();
        int[] valors = new int[a];
        a++;


    }
}
