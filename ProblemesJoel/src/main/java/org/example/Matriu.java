package org.example;

public class Matriu {

    public static void main(String[] args) {


        //Declarar variable

        int [][] matriu= new int[5][];    //vectors multidimensionals nomes es obligatori indicar la primera dimensio (fila)

        //Instanciem les files
        matriu[0] = new int[1];
        matriu[1] = new int[6];
        matriu[2] = new int[8];
        matriu[3] = new int[4];

        //Recorrer la matriu de dalt a baix i d'esquerra a dreta
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%d ",matriu[i][j]=i+j);
            }
            System.out.println();
        }
    }
}
