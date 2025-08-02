package com.ja;

public class Polindrome {
    public static void main(String[] args) {
        int number = 852417;
        int original = number;
        int reverse = 0;
        while(number!= 0) {
            int digit = number % 10; // get last digit
            reverse = reverse * 10 + digit; // add to reverse
            number = number / 10;// remove last digit
        }
if (original == reverse ) { // 852417 == 7134258 ---- false
            System.out.println(original + "is a polindrome ");
        } else {
            System.out.println(original + "is not a polindrome");
        }
    }
}
