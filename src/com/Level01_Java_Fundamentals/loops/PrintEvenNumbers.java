package com.Level01_Java_Fundamentals.loops;

import java.util.Scanner;
//  Print all even numbers from 1 to N.

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
