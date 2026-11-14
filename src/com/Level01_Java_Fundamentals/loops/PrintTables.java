package com.Level01_Java_Fundamentals.loops;

import java.util.Scanner;
//  Print table of a number (like 5, 10, 15…. up to 10 times).

public class PrintTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}