package com.Level01_Java_Fundamentals.strings;

import java.util.Scanner;
// Count number of vowels in a string.

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String vowels = "aeiouAEIOU";

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                cnt += 1;
            }

        }
        System.out.println(cnt);

    }
}