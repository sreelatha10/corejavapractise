package com.ja;

/**
 *
 *
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        // number of terms n
        int n = 10, firstNum = 0, secondNum = 1;
        //creating variable
        int nextNum;
        int i = 1;
        while (i <= n) {
            System.out.println(firstNum + "  ");
            nextNum = firstNum + secondNum; // 0 + 1 = 1
            firstNum = secondNum; // firstNum is updated to secondNum
            secondNum = nextNum; // secondNum is updated to nextNum
            i++;

        }
    }
}
