package com.Level01_Java_Fundamentals.math;

import java.util.Scanner;

// Check if a number is palindrome.

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum = sc.nextInt();

        int num = originalNum;
        int revNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = num / 10;
        }

        if (revNum == originalNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is Not a Palindrome.");
        }
        sc.close();
    }

}
