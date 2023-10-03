package org.example;

public class Conversions {

    public static void main(String[] args) {
        double valorReal = 2.34 ;
        int valorEnter = (int) valorReal; // CASTING --> converteix el valor al tipo indicat
        //String text = (String)56; no es pot fer casting ja que String ja que no es un numero
        String text = "" + 56; //genera String "56

        valorEnter = Integer.parseInt(text); //ValorEnter contindra un 56

        System.out.println(valorEnter);
    }

}
