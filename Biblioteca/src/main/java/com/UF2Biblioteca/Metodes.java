package com.UF2Biblioteca;

public class Metodes {

    public static int sumaNaturals(int n){
        //casos de parada (no recursius)
        if (n == 0) return 0;
        if (n<0) return -1;

        //cas recursiu

        return n + sumaNaturals(n-1);

    }

    public static double potenciaRec(double base, int exponent){
        //casos de parada
        if (exponent == 0) return 1;

        //casos recursius
        if (exponent > 0) return base * potenciaRec(base, exponent-1);
        return 1/potenciaRec(base, -exponent);
    }

    public static int nombreCombinatoriRec(int n, int m){
        if (n == m || m==0) return 1;
        if (n<m) return -1;
        return nombreCombinatoriRec(n-1, m-1) + nombreCombinatoriRec(n-1, m);
    }

    public static int factorial(int n){
        if (n==0) return 1;
        if (n<0) return -1;
        return n*factorial(n-1);
    }
    public static int nombreCombinatori(int n, int m){
        if (n<m) return -1;
        return factorial(n) / (factorial(m) * factorial(n-m));
    }

    public static double potenciaE(int x){
        double resultat = 0;
        if (x == 0) return resultat;

        for (int i = 0; i < 10; i++) {

            resultat+=potenciaRec(x,i) / factorial(i);

        }
        return resultat;
    }

    public static boolean primer(int n){

        if (n<=1) return false;

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;

    }

    public static int seguentPrimer(int n){

        if (n<2) return 2;

        while (true){
            n++;
            if (primer(n)) break;
        }
        return n;

    }

}


