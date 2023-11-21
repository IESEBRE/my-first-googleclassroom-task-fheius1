package org.example;

import java.util.Scanner;
public class WebCasteller {

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
}
