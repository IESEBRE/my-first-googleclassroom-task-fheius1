package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CistellCompra1 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int productes = Integer.parseInt(ent.next());
        String [] noms = new String[productes];
        double[] preus= new double[productes];

        //Llegir productes i guardarlos
        while (productes-- > 0) {
            noms [productes] = ent.next();
            preus [productes] = Double.parseDouble(ent.next());
        }

        int select = Integer.parseInt(ent.next());

        //Fer una copia dels vectors originals
        double[] copiapreus= new double[noms.length];
        for (int i = 0; i < noms.length; i++) {
            copiapreus[i]=preus[i];
        }

        //Ordenar l'array copiat
        Arrays.sort(copiapreus);


        //Preus buscats
        double mesbarat=copiapreus[0];
        double mescar=copiapreus[copiapreus.length-1];
        double seleccionat=copiapreus[copiapreus.length-select];

        String productebarat= null;
        String productecar= null;
        String producteseleccionat= null;

        //Recorresr vector original buscant preus
        int comptadorproductes=0;
        for (int i = 0; i < preus.length && comptadorproductes<3; i++) {
            if (preus[i]== mesbarat) {
                productebarat=noms[i];
                comptadorproductes++;
            }
            if (preus[i]== mescar){
                productecar=noms[i];
                comptadorproductes++;
            }
            if (preus[i]== seleccionat) {
                producteseleccionat=noms[i];
                comptadorproductes++;
            }

            //Mostrar resultats
            System.out.println("EL MES CAR: "+productecar+ " "+ mescar);
            System.out.println("EL MES BARAT: "+productebarat+ " "+ mesbarat);
            System.out.println("EL BUSCAT: "+producteseleccionat+ " "+ seleccionat);
        }


    }
}
