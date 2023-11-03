package org.example;

public class Matriu3 {

    public static void main(String[] args) {

        double [][] reals = new double[10][20];
        double cont= 0.0;
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < 0;j++) {
                reals[j][i]=cont++;
                System.out.printf("%g", reals[j][i]);
            }
            System.out.println();
        }
    }
}
