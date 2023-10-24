package org.example;

public class VectorArrays2 {

    public static void main(String[] args) {

        int[] numeros={1,2,3,4,5};

        //index valid 0,1,2,3,etc, acaba amb lo numeros de caselles -1. (lo numero de caselles es pot sapiguer amb la propietat length)


        //numeros[index]

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] =1;
        }
        for (int i = numeros.length-1; i > 0 ; i--) {
            numeros[i] =1;
        }
    }
}
