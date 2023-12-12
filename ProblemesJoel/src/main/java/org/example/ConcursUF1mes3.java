package org.example;

import java.util.Scanner;
public class ConcursUF1mes3 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();
        int comptador = 0;
        while (casos-- > 0) {

            String linia1 = ent.next();
            String linia2 = ent.next();

            int mesllarg = linia1.length() < linia2.length() ? linia1.length() : linia2.length();


            for (int i = 0; i <= linia1.length() && i < linia2.length() && comptador < mesllarg / 2.0; i++) {
                if (linia1.charAt(i) == linia2.charAt(i)) comptador++;
            }

            if (comptador >= mesllarg / 2.0) System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
            else System.out.println("GRACIES WEBCASTELLER");

        }
        }
    }

/*
public class ConcursUF1mes3 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            String par1= ent.nextLine();
            String par2= ent.nextLine();

            int mesllarg= par1.length()>= par2.length() ? par1.length() : par2.length();
            int comptador= 0;

            for (int i = 0; i < par1.length() && i < par2.length() && comptador < (double)mesllarg/2; i++) {
                if (par1.charAt(i)==par2.charAt(i)) comptador++;
            }

            if (comptador>= (double)mesllarg/2) System.out.println("GRACIES WEBCASTELLER"); //Tambe se pot fer / entre 2.0 sense tindre que fer el casting (double)
            else System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
        }
    }
 */

/*
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, resultatop;
        String operacio, num1, num2;

        num = input.nextInt();

        do {
            String binari = "";
            operacio = input.skip("[\r\n]*").nextLine();
            num1 = operacio.substring(0, operacio.indexOf(' '));
            num2 = operacio.substring(operacio.lastIndexOf(' ') + 1, operacio.length());

            if (operacio.contains("+")){
                resultatop = Integer.parseInt(num1) + Integer.parseInt(num2);
            } else {
                resultatop = Integer.parseInt(num1) - Integer.parseInt(num2);
            }

            if (resultatop == 0) {
                binari = "0";
            }

            while (resultatop > 0) {
                if (resultatop % 2 == 0) {
                    binari = "0" + binari;
                } else {
                    binari = "1" + binari;
                }
                resultatop = resultatop / 2;

            }

            System.out.println(binari);

            num--;
        }while (num > 0);

    }
 */

/*
 public static void main(String[] args) {

        int num1= 89789798;
        int num2= 72665512;

        System.out.println(num1 * num2);
    }
 */

/*
Scanner ent = new Scanner(System.in);

        while (true) {

            int longitudCotxe = ent.nextInt();


            if (longitudCotxe == 0) {
                break;
            }

            int forat = 1;
            int foratSeleccionat = -1;
            int millorDiferencia = Integer.MAX_VALUE;

            while (true) {
                int inici = ent.nextInt();
                if (inici == 0) {
                    break;
                }

                int finalForat = ent.nextInt();


                int diferencia = finalForat - inici - longitudCotxe;


                if (diferencia >= longitudCotxe / 2 && diferencia < millorDiferencia) {
                    millorDiferencia = diferencia;
                    foratSeleccionat = forat;
                }

                forat++;
            }


            if (foratSeleccionat == -1) {
                System.out.println("NO");
            } else {
                System.out.println("SI " + foratSeleccionat);
            }
        }
 */

/*
 Scanner ent = new Scanner(System.in);

        int numCasos = Integer.parseInt(ent.nextLine());

        for (int i = 0; i < numCasos; i++) {

            String[] frases = ent.nextLine().split(", ");

            String frase1 = frases[0];
            String frase2 = frases[1];

            String rima = encontrarRima(frase1, frase2);

            System.out.println(rima);
        }

    }

    private static String encontrarRima(String frase1, String frase2) {
        int longitud1 = frase1.length();
        int longitud2 = frase2.length();

        int minLongitud = Math.min(longitud1, longitud2);


        StringBuilder rima = new StringBuilder();
        for (int i = 1; i <= minLongitud; i++) {
            char char1 = frase1.charAt(longitud1 - i);
            char char2 = frase2.charAt(longitud2 - i);

            if (char1 == char2) {
                rima.insert(0, char1);
            } else {
                break;
            }
        }


        return rima.length() > 0 ? rima.toString() : "#";
 */