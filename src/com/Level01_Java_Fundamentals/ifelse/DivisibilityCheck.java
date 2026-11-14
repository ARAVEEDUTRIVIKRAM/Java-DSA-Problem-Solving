package com.Level01_Java_Fundamentals.ifelse;
import java.util.Scanner;

// Read a number and check if it is divisible by both 3 and 5.

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisable");
        } else {
            System.out.println("Not Divisable");
        }

    }
}
