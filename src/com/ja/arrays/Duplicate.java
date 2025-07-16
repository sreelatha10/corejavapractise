package com.ja.arrays;

public class Duplicate {
    public static void main(String[] args) {
    int[] num = {2,2,3,4,1,2,12,1} ;
        System.out.println("duplicate number is : " );
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
           }
        }

}
