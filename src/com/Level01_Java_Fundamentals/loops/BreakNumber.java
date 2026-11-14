package com.Level01_Java_Fundamentals.loops;

import java.util.Scanner;
// Print numbers from 1 to 100, but stop when number is 37 (use break).

public class BreakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i == 37) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}

