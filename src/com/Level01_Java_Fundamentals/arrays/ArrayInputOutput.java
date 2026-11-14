package com.Level01_Java_Fundamentals.arrays;

import java.util.Scanner;
// Read n, then input n elements into an array and print them.

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr3 = new int[N];
        for (int i = 0; i < N; i++) {
            arr3[i] = sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}