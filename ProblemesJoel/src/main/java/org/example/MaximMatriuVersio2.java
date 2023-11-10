package org.example;

import java.util.Scanner;

public class MaximMatriuVersio2 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();
        int posicio=1;

        while (casos-- > 0){

            int numerof = ent.nextInt();
            int numeroc = ent.nextInt();
            int maxim=0;


            for (int i = 1; i < numerof*numeroc; i++) {
                int valor= ent.nextInt();
                if (i == 1){
                    maxim= valor;
                    posicio=1;

                }else if (valor>= maxim) {
                    maxim = valor;
                    posicio = i;

                }
            }
            //mostrar la posicio user-frindly (per a un usuari) del valor maxim
            System.out.printf("%d %d %n", ((posicio-1)/numeroc) +1,((posicio-1)%numeroc)+1);
        }

    }
}