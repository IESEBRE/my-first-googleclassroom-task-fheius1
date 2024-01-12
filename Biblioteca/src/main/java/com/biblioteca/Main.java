package com.biblioteca;

public class Main {
    public static int buscaCadena(String text, String subcadena, int num){

        //Casos especials
        if (text == null || subcadena == null) return -1;
        if (num < 0) num = 0;
        if (subcadena.isEmpty()) return (num<text.length()?num:text.length());
        if (num >= text.length()) return -1;
        if (subcadena.length() > text.length()) return -1;


        //Casos de parada
        for (int i = num; i + subcadena.length() < text.length(); i++) {
            //Comprovar si la primera lletra del segon text coinxideix amb la i-esima del primer
            if (text.substring(i, i + subcadena.length()).equals(subcadena)) return i;

        }


        return -1;
        //return text.indexOf(subcadena,num);
        /*Versio1

        //Casos especials
        if (text == null || subcadena == null) return -1;
        if (num < 0) num = 0;
        if (subcadena.isEmpty()){
            if (num >= text.length()) return text.length();
            else return num;
        }
        if (num >= text.length()) return -1;
        if (subcadena.length() > text.length()) return -1;
        for (int i = num; i < text.length(); i++) {
            if (text.substring(i, i + subcadena.length()).equals(subcadena)) return i;
        }



         */

    }
}