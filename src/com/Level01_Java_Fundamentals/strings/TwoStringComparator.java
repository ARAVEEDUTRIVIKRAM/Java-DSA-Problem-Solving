package com.Level01_Java_Fundamentals.strings;

import java.util.Scanner;
// 1. Given two strings, check if they are equal (use equals()).

public class TwoStringComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.equals(s2)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not Equal");
        }

    }
}