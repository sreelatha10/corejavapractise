package com.ja.conditions;

public class switches {
    public static void main(String[] args) {

        String name = "abc";
        switch (name) {
            case "bca":
                System.out.println("first one true");
                break;
            case "cab":
                System.out.println("second is wright");
                break;
            case "abc":
                System.out.println("third is correct");
                break;
            default:
                System.out.println("print value");

        }
    }
}