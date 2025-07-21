package com.ja.arrays;

public class missing {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6,7,8,9,11};
        int sum1 = 0;
        for(int i = 0;i<num.length;i++){
            sum1 = sum1 + num[i];
        }
        System.out.println("sum of elements in array");
        int sum2 = 0;
        for (int i = 1;i <= 11;i++){
            sum2 = sum2+ i;
        }
        System.out.println("sum of range of elements in array");
        System.out.println("missing number is " + (sum2-sum1));

    }
}
