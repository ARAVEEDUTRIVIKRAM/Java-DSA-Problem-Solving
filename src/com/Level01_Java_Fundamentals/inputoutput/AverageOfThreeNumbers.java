package com.Level01_Java_Fundamentals.inputoutput;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){
        //3. Read three numbers and print their average (as double).

        Scanner sc=new Scanner(System.in);
        double num3=sc.nextDouble();
        double num4=sc.nextDouble();
        double num5=sc.nextDouble();

        double sumNum=(num3+num4)+num5;
        System.out.println("Average: "+ sumNum/3);
        sc.close();



    }
}
