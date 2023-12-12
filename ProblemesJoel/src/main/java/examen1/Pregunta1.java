package examen1;

import java.util.Scanner;

    public class Pregunta1 {

        public static void main(String[] args) {

            Scanner ent = new Scanner(System.in);
            int casos = ent.nextInt();

            while (casos-- > 0) {
                String frase= ent.skip("[\r\n]*").nextLine().trim();
                String paraula[]=frase.split(" ");

                int numeroI = ent.nextInt();
                int numeroF = ent.nextInt();
                int numeroS = ent.nextInt();


            }
        }
    }



