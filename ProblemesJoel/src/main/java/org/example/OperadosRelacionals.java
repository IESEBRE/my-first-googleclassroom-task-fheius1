package org.example;

import java.util.Scanner;

public class OperadosRelacionals {

    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        String name = "John";
        String name2 = new String("John");
        int age = 17;

        System.out.println(name.equals("John") || !(age > 17));
        System.out.println(name.equals("John") && !(age == 17));
        System.out.println(name.equals("John") || name.equals("Jane") && age >= 16 && age < 25);
    }
}
