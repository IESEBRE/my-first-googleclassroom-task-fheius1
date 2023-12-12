package org.example;

 import java.util.Scanner;

 public class ParaulaLlarga {

     public static void main(String[] args) {

         Scanner ent = new Scanner(System.in);
         int casos = ent.nextInt();

         while (casos-- > 0) {


             String frase= ent.skip("[\r\n]*").nextLine().trim();
             String paraula[]=frase.split("");

             
             int maxllarga = -1;
             for (int i = 0; i < paraula.length; i++) {
               //  if (paraula[i])
                 
             }
            
         }
     }
 }








