package com.Level01_Java_Fundamentals.strings;

import java.util.Scanner;
// Read a string and print it in reverse.

public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Vikram";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);

        String s = "Vikram";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = new String(sb);
        System.out.println(s1);

    }
}