package org.example;

public class Cadenes1 {

    public static void main(String[] args) {

        char [] paraula = new char[]{'B','o','n',' ','d','i','a',};

        for (int i = 0; i < paraula.length; i++) {

            System.out.println(paraula[i]);
        }

        String paraulastring = new String(paraula);
        for (int i = 0; i < paraulastring.length(); i++) {
            System.out.print(paraulastring.charAt(i));
        }

        //Comparar el vector i lo String tenen el mateix text
    }
}
