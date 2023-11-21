package org.example;

public class Cadenes5 {
    public static void main(String[] args) {

        System.out.println("0123456789".substring(2));
        int i = 0;

        System.out.println("0123456789".substring(2, 5));
        //System.out.println("0123456789".substring(-2, 5)); lo index no pot ser negatiu
        //System.out.println("0123456789".substring(5, 2)); lo index inicial no pot ser mes gran que lo final
        //System.out.println("0123456789".substring( 3, 50)); lo index index final no pot ser major que lo string
        System.out.println("0123456789".substring(2, "0123456789".length()));

    }
}

/*while (true){
            int j = "0123456789".indexOf('5', i); //Per a buscar mes d'una lletra es "conjunt que vols buscar"
            if (j == -1) break;
            System.out.println("0123456789 ".substring(j));
            i = j +1;
        }*/

/*Indexos

  int i=0;
        while (true){

            int j = "Abracadabra".indexOf('a', i); //Per a buscar mes d'una lletra es "conjunt que vols buscar"
            if (j == -1) break;
            System.out.println("La lletra esta en la posicio "+j);
            i = j +1;
        }


        while (true){
            int j = "Abracadabra".lastIndexOf("br", i); //Per a buscar mes d'una lletra es "conjunt que vols buscar"
            if (j == -1) break;
            System.out.println("La lletra esta en la posicio "+j);
            i = j -1;
        }

 */

/*Comprovar si comença
        System.out.println("Javi".startsWith("Ja"));
        System.out.println("Javi".startsWith("ja"));
        System.out.println("Javi".toLowerCase().startsWith("ja".toLowerCase()));
        System.out.println();

        //Comprova si acaba
        System.out.println("Javi".endsWith("vi"));
        System.out.println("Javi".endsWith("vI"));
        System.out.println("Javi".toLowerCase().endsWith("ja".toLowerCase()));
        System.out.println();


        //Comprovar si conte
        if ("Javi".contains("avi")) System.out.println("Si");
        else System.out.println("No");
        System.out.println();



        System.out.println("Abracadabra".indexOf('a', 4));
        System.out.println("Abracadabra".indexOf('a', 3));
        System.out.println("Abracadabra".indexOf('a', 6));

        */