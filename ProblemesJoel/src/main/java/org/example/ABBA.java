package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class ABBA {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.skip("[\r\n]*").nextInt();

        while (casos-- > 0) {

            //Tractament de cas
            String [] noms = ent.skip("[\r\n]*").nextLine().split(", ");

            //Recorrer el vector
            for (int i = 0; i < noms.length-1; i++) {
                //Treure accents de noms
                String s=noms[i].toUpperCase(); //Hu passem a majuscules
                s = Normalizer.normalize(s, Normalizer.Form.NFD);
                s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                System.out.print(s.charAt(0)); //Mostrem la primera lletra del String

            }

            //Guardem a "noms" els noms de la ultima casella
            noms=noms[noms.length-1].split(" i ");

            //Comprovar si queden 2 o 3 noms al vector
            switch (noms.length){
                case 2:
                    for (int i = 0; i < noms.length-1; i++) {
                        //Treure accents de noms
                        String s=noms[i].toUpperCase(); //Hu passem a majuscules
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0)); //Mostrem la primera lletra del String
                    }
                    break;

                case 3:
                    for (int i = 0; i < noms.length-1; i++) {
                        if (i == 1) continue;
                        String s = noms[i].toUpperCase(); //Hu passem a majuscules
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0));
                    }
                    break;
            }
            System.out.println();

        }
    }
}
