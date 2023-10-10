package org.example;

import java.util.Locale;

public class Formateig {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        char lletra='t';
        int numero = 598756485;
        System.out.format("%C %n", 'a');
        System.out.format("%C %n", lletra);
        System.out.printf("%b %n", numero>0 );
        System.out.printf("Decimal: %d Octal: %o Hexadecimal: %x", numero, numero, numero);
        System.out.println(".");
        System.out.printf("%f %1$e %1$E %1$g %1$G", Math.PI); //LO dolar sereveix per a que repeteixi la primera variable i no tindre que ficarla 5 vegades
        System.out.println();
        System.out.printf("%.2f %n",Math.PI); //Per a mostrar nmes los decimals amb lo format
        System.out.printf("%10.2f %n",Math.PI); //Perper a moure los numeros
        System.out.printf("%+.2f %n",Math.PI); //Per a dirme si es positiu o negatiu
    }
}
