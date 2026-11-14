package com.Level01_Java_Fundamentals.arrays;

import java.util.Scanner;
// Find max, min, and sum of an array.

public class ArrayMinMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 57, 57, 8, 9, 44};
        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("sum:" + sum);
    }
}