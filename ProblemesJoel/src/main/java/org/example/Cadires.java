package org.example;


import java.util.Scanner;

public class Cadires {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int casos = ent.skip("[\r\n]*").nextInt();

        while ( casos-- > 0) {
            //Tractar casos
            String [] xiquets,torns;

            //Omplir vector
            String noms = ent.skip("[\r\n]*").nextLine();
            xiquets=noms.split(" "); //Crea un vector d'Strings que te les subcadenes de la cadena inicial separades pel caracter que passem com a paramter
            //System.out.println(Arrays.toString(xiquets)); Per a comprobar que s'han guardat en les caselles

            torns = ent.skip("[\r\n]*").nextLine().split(" ");

            //Comprobar si hi ha mes torns que xiquets
            if (xiquets.length<= torns.length){
                System.out.println("CAP GUANYADOR");
                continue; //Torna a l'inici del bucle i pasem al seguent cas
            }

            int inici=0;

            //Recorrem el vector de torns
            for (int i = 0; i < torns.length; i++) {
                int voltes = Integer.parseInt(torns[i])-1;
                //Buscar seguent xiquet no null

                while (voltes>0){
                    do {
                        inici++;
                        inici = inici % xiquets.length;
                        if (xiquets[inici] !=null) break;

                    }while (true);{
                        voltes--;
                    }

                }

            }

            for (int i = 0; i < xiquets.length; i++) {
                if (xiquets[i] != null) System.out.print(xiquets[i]+ " ");
            }
            System.out.println();



        }
    }
}
