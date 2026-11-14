package com.Level01_Java_Fundamentals.ifelse;
import java.util.Scanner;

// Read an integer and print whether it is positive, negative, or zero.

public class PrintPostiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();

        if(num>0){
            System.out.println("Positive");
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }


    }
}
