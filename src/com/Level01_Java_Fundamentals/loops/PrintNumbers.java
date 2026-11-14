package com.Level01_Java_Fundamentals.loops;

import java.util.Scanner;

// Print numbers from 1 to N using: for, while

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.println(i);
        }

        int i =1;
        while(i<=N){
            System.out.println(i);
            i++;
        }

    }
}