package com.Level01_Java_Fundamentals.strings;

import java.util.Scanner;
// Read a string and print its length and first & last character.

public class StringDetailsPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println("Length: " + s.length());
        System.out.println("First: " + s.charAt(0));
        System.out.println("Last: " + s.charAt(s.length() - 1));

    }
}