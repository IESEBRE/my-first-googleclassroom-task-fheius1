package org.example;

import java.util.Scanner;
public class BolasLobas2 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numcasos = ent.nextInt();

        while (numcasos-- > 0) {

            String paraula1=ent.next();
            String paraula2=ent.next();
            boolean trobat= false;

            for (int i = 0; !trobat && i < paraula1.length(); i++) {
                for (int j = 0; !trobat && j < paraula2.length(); j++) {
                    if (i!=j && paraula1.charAt(i)== paraula2.charAt(j) && paraula1.charAt(j)== paraula2.charAt(i)){
                        System.out.println(i+ " "+ j);
                        trobat= true;
                    }

                }
            }
        }
    }
}

/*
 Scanner ent = new Scanner(System.in);
        int numcasos = ent.nextInt();

        while (numcasos-- > 0) {

            String[] paraula = new String[2];
            paraula[0] = ent.next();
            paraula[1] = ent.next();

            int primeraPos = -1;

            for (int i = 0; i < paraula[0].length(); i++) {
                if (paraula[0].charAt(i) != paraula[1].charAt(i)) {
                    if (primeraPos == -1) {
                        primeraPos = i;
                    } else {
                        System.out.println((primeraPos ) + " " + (i));
                        break;
                    }
                }
            }

        }
 */