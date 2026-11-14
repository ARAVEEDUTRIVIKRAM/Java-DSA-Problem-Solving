package com.Level01_Java_Fundamentals.math;

import java.util.Scanner;

// Given n, print sum of digits and count of digits.

public class DigitStatsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Sum of digits: 0");
            System.out.println("Count of digits: 1");
        } else {
            int sum = 0;
            int count = 0;
            int temp = Math.abs(n); // Handles negative inputs safely

            while (temp > 0) {
                sum += temp % 10;
                count++;
                temp /= 10;
            }

            System.out.println("Sum of digits: " + sum);
            System.out.println("Count of digits: " + count);
        }
        sc.close();
    }
}
