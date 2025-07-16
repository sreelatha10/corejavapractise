package com.ja.arrays;

public class Even {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 4, 5, 66, 7, 8, 9};
        System.out.println("even numbers are");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
