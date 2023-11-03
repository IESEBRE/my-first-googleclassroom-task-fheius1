package org.example;

public class Matriu2 {

    public static void main(String[] args) {

        //declarar un superarray

        char [][][][][] superarray;

        //instanciar
        superarray = new char[10][10][10][10][10];

        //superarray = new char[10][10][][10][10]; -----------> no es poden deixar buits pel mitg


        for (int i = 0; i < superarray.length; i++) {
            for (int j = 0; j < superarray[i].length; j++) {
                for (int k = 0; k < superarray[i][j].length; k++) {
                    for (int l = 0; l < superarray[i][j][k].length; l++) {
                        for (int m = 0; m < superarray[i][j][k][l].length; m++) {
                            superarray[i][j][k][l][m] =(char) (i+j*k/(l+1)+m);
                            System.out.printf("%c", superarray[i][j][k][l][m]);
                        }

                        System.out.println();
                    }
                }
            }
        }
    }
}
