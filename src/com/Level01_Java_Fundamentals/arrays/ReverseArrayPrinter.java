package com.Level01_Java_Fundamentals.arrays;

import java.util.Arrays;
import java.util.Scanner;
// Reverse an array and print it.

public class ReverseArrayPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 1, 2, 3};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}