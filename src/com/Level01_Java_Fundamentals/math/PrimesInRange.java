package com.Level01_Java_Fundamentals.math;

import java.util.Scanner;

// Print all primes between 1 and N.

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Primes between 1 and " + n + ": ");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
