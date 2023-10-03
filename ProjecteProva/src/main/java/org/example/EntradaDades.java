package org.example;

import java.util.Scanner;

public class EntradaDades {

    public static void main(String[] args) {

        //Declaracio de variables
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix un numero");

        valor = entrada.nextInt();
        System.out.println(valor);

        System.out.println("El numero es" + valor);

    }
}