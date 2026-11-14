package com.Level01_Java_Fundamentals.strings;

import java.util.Scanner;
// Check if a string is palindrome (same forward and backward).

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = new String(sb);

        if (s.equals(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}