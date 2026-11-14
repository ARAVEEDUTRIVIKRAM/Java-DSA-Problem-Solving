package com.Level01_Java_Fundamentals.arrays;

import java.util.Scanner;
// Count how many elements are even.

public class ArrayEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr3 = {2, 67, 7, 8, 9, 6, 4, 36,};
        int cnt = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
