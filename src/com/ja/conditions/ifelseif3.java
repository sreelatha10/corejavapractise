package com.ja.conditions;

public class ifelseif3 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 2300;
        int amount;
        int speed = 0;
        
        if (withdraw % 100 <= 40) {
            System.out.println("very slow - speed up");
        } else if (speed <= 60) {
            System.out.println("safe speed");
        } else if (speed <= 80) {
            System.out.println("warning:slightly fast");
        } else if (speed <= 100) {
            System.out.println("over speed fine 500");
        } else {
            System.out.println("danger heavy fine");
        }
    }
}

