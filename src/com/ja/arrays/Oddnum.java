package com.ja.arrays;

public class Oddnum {
    public static void main(String[] args) {
        int[] numbers = {1,23,4,5,66,7,8,9};
        System.out.println("odd numbers are");
        for (int num : numbers) {
            if (num % 2   != 0){
                System.out.println(num);
            }
        }
    }
}
