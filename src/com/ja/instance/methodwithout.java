package com.ja.instance;

public class methodwithout {
    static String city = "Nandyal";
    int num = 100;

    static void mycity() {
        System.out.println("city :" + city);
    }

    void newcity() {
        System.out.println("num :" + num);
    }

    public static void main(String[] args) {
        mycity();

        methodwithout intob = new methodwithout();
        intob.newcity();
    }
}




