package com.Level01_Java_Fundamentals.arrays;

import java.util.Scanner;
// 1. Given an array and number x, check if x exists in array (linear search).

public class ArrayElementSearcher {

    public static int LinearSearch(int[] arr, int x){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = sc.nextInt();
        int result = LinearSearch(arr, x);

        if (result == -1) {
            System.out.println(x + " not found in array");
        } else {
            System.out.println(x + "is found in arry");
        }


    }
}
