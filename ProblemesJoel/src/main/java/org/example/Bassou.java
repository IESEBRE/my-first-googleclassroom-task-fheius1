package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bassou {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        // Número de persones
        int persones = ent.nextInt();

        // Tamany del array
        String[] bassou = new String[persones];

        // Índex per rastrejar la posició a l'array
        int index = 0;

        // Verifica cada persona en la clase i l'afegeix a la llista si es Bassou
        for (int i = 0; i < persones; i++) {
            String persona = ent.next();
            if (persona.equalsIgnoreCase("Bassou")) {
                bassou[index] = persona;
                index++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(bassou, index)));

    }
}

/*
Scanner ent = new Scanner(System.in);

        // Número de personas
        int persones = ent.nextInt();

        // Tamaño máximo del array basado en el número de personas


        // Índice para rastrear la posición en el array
        int index = 0;

        // Verifica cada persona en la clase y añade a la lista si es "Bassou"
        for (int i = 0; i < persones; i++) {
            String persona = ent.next();
            if (persona.equalsIgnoreCase("Bassou")) {
                bassou[index] = persona;
                index++;
            }
        }
 */
/*
 // Número de personas
        int persones = ent.nextInt();

        // Lista para almacenar las personas que te odian
        ArrayList<String> bassou = new ArrayList<>();

        // Verifica cada persona en la clase y añade a la lista si es "Bassou"
        for (int i = 0; i < persones; i++) {
            String persona = ent.next();
            if (persona.equalsIgnoreCase("Bassou")) {
                bassou.add(persona);
            }
        }

        // Imprime la lista de personas que te odian en formato requerido
        System.out.println(Arrays.toString(bassou.toArray()));

 */
/*
 //Numero de persones
        int persones = ent.nextInt();


        // Lista para almacenar las personas que te odian
        ArrayList <String> bassou = new ArrayList<>();

        // Verifica cada persona en la clase
        for (int i = 0; i < persones; i++) {
            String persona = ent.nextLine();

            // Verifica si la persona es Bassou y la añade a la lista de personas que te odian
            if (persona.equalsIgnoreCase("Bassou")) {
                bassou.add(persona);
            }
        }

        // Imprime la lista de personas que te odian en formato requerido
        if (!bassou.isEmpty()) {
            System.out.print("[");
            for (int i = 0; i < bassou.size(); i++) {
                System.out.print(bassou.get(i));
                if (i < bassou.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("Nadie te odia, ¡felicidades!");
        }

        System.out.println(Arrays.toString(bassou.toArray()));
 */