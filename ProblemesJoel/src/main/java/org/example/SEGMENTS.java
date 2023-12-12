package org.example;

import java.util.Scanner;

public class SEGMENTS {

    public static void main(String[] args) {

        while (true){
            Scanner ent = new Scanner(System.in);
            String linia =ent.nextLine().trim();

            if (linia.equals("99:99 0")) break;
            String [] dades= linia.split(" ");
            String temps = dades[1];
            final int COST_PUNTS = 10;  //les constants s'escriuen en majuscula
            final int COST_SEGMENT=15;
            int hora= Integer.parseInt(dades[0]);
            int minuts= Integer.parseInt(dades[1]);
            int cost=0;
            //                0 1 2 3 4 5 6 7 8 9
            int[] segments = {6,2,5,5,4,5,6,3,7,6};

            for (int i = 0; i < temps.length(); i++) {
                if (temps.charAt(i)==':') cost= cost +COST_PUNTS;
                else cost= cost+ segments[Integer.parseInt(temps.charAt(i)+"")];
            }

            if (minuts != 59) minuts++;
            else {
                minuts= 0;
                if (hora != 23) hora++;
                else hora = 0;
            }
            temps= (hora<=9 ? "0": "")+hora+ ":" +(minuts<=9 ? "0": "")+minuts;

            }
            System.out.println();


        }








    }


/*int cost = 0;



         */

/*



        String temps= "23:59";
        String[] parts= temps.split(":");

        int minuts= Integer.parseInt(parts[1]);



        System.out.println(temps);

 */