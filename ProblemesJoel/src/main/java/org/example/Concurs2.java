package org.example;

import java.util.Scanner;

public class Concurs2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numpisos;
        int comptador = 1;

        int casos = ent.nextInt();

        while (casos >= comptador) {
            numpisos = ent.nextInt();
            System.out.println(numpisos * (numpisos + 1) * (2 * numpisos +1) / 6);
            comptador++;
        }
    }
}





/* Agulles

Scanner ent = new Scanner(System.in);
        int casos = ent.skip("[\r\n]*").nextInt();

        while (casos-- > 0){
            String[] temps= ent.skip("[\r\n]*").nextLine().split(":");
            int hora = Integer.parseInt(temps[0]);
            int minuts = Integer.parseInt(temps[1]);

            if (minuts == (hora *5 +minuts/12)%60) System.out.println("SI");
            else System.out.println("NO");
        }

 */



/*Cerca Aproximada
package org.example.nf3.vectors;
import java.util.Scanner;

public class cerca {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int N = ent.nextInt();
        for (int i = 0; i < N; i++) {
            int K = ent.nextInt();
            int[] mida = new int[K];

            for (int j = 0; j < K; j++) {
                mida[j] = ent.nextInt();
            }
            int M = ent.nextInt();
            if (sabates(mida, M)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean sabates(int[] mides, int M) {
        boolean found = false;
        for (int mida : mides) {
            if (mida == M || mida == M - 1 || mida == M + 1) {
                found = true;
                break;
            }
        }
        return found;
    }
}
 */



/* Blitzcrank
import java.util.Scanner;

public class Blitzcrank {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int Acarry_adversario;
        int Bblitz_carry;
        int logintut_de_blitz;

        while (true) {
            do {
                Acarry_adversario = ent.nextInt();
                Bblitz_carry = ent.nextInt();
                logintut_de_blitz = ent.nextInt();
                if(Acarry_adversario < 0 && Bblitz_carry < 0 && logintut_de_blitz < 0);
                else break;
            }while (true);

            if(Acarry_adversario == 0 && Bblitz_carry == 0 && logintut_de_blitz == 0)break;


            int a =Acarry_adversario * Acarry_adversario;
            int b = Bblitz_carry* Bblitz_carry;
            float c  = a + b;
            c = (float) Math.sqrt(c);
            if (c <= logintut_de_blitz) System.out.println("SI");
            else System.out.println("NO");


        }
    }
}

 */











 /* Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos-->0){
            int numpisos= ent.nextInt();
            int gotsinici=1;
            int gotstotal = 0 ;
                while (true){
                    gotstotal = gotsinici++ * numpisos;
                    System.out.println(gotstotal);
                    break;
                }
        }*/



