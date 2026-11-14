package com.Level01_Java_Fundamentals.loops;

import java.util.Scanner;
// Find the sum of numbers from 1 to N.

public class FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
