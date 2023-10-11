package org.example;

import java.util.Scanner;

public class Repetitius5 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num, fi, temp;

        System.out.println("Introdueix dos numeros");
        num= ent.nextInt();
        fi= ent.nextInt();

        if (num>fi){
            temp=num;
            num=fi;
            fi=temp;
        }

        for (;num<=fi;num++){
            System.out.println(num % 2 == 0 ? num + " es parell" : num + " es imparell");
        }

    }
}
