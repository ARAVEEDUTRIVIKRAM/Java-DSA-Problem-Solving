package com.Level01_Java_Fundamentals.inputoutput;
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args){
        //2. Read two integers and print their sum, difference, product, quotient.

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("Sum: " + (num1+num2));
        System.out.println("Subtraction: "+  (num1-num2));
        System.out.println("Multiplication: " + (num1*num2));
        System.out.println("ModuloDivision: " + (num1%num2));
        System.out.println("floorDivision: " + (num1/num2));
    }
}
