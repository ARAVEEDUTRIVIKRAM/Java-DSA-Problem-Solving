package com.Level01_Java_Fundamentals.inputoutput;

import java.util.Scanner;

public class ReadNameAndAge {
    public static void main(String[] args){
        //1. Read your name and age, then print: Hello <name>, you are <age> years old.

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are" + age + "years old.");


    }
}
