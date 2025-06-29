package com.ja.encapsulation;

public class practice2 {
    public static void main(String[] args) {
        practice1 abc = new practice1();
        abc.setName("nandyal");
        abc.setRollnumber(10);
        abc.setMarks(90);
        System.out.println("Name: " + abc.getName());
        System.out.println("Rollno: " + abc.getRollnumber());
        System.out.println(" Marks: " + abc.getMarks());
    }
}
