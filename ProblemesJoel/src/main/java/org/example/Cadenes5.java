package org.example;

public class Cadenes5 {
    public static void main(String[] args) {

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
    }
}

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