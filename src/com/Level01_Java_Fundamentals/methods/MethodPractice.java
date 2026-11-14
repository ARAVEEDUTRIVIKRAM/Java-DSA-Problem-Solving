package com.Level01_Java_Fundamentals.methods;

public class MethodPractice {

    // 1. Returns bigger number
    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    // 2. Returns smallest of 3 numbers
    static int min(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    // 3. Checks if number is positive
    static boolean isPositive(int a){

        return a>0;
    }

    // 4. Returns sum of array elements
    static int sumArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    // 5. Counts vowels in a string

    static int countVowels(String s){
        String vowels = "aeiouAEIOU";
        int cnt=0;
        for(int i=0;i<s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                cnt++;
            }
        }
        return cnt;
    }




    public static void main(String[] args){
        int res = max(40,100);
        System.out.println(res);

        int res1 = min(40,100);
        System.out.println(res1);

        boolean res2 = isPositive(23);
        System.out.println(res2);

        int[] arr = {12, 13, 14, 15 ,16};
        int res3 = sumArray(arr);
        System.out.println(res3);

        String s = "vikram";
        int res4 = countVowels(s);
        System.out.println(res4);


    }
}
