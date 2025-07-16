package com.ja.arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] marks = new int[8];
        marks[0] = 1;
        marks[1] = 23;
        marks[2] = 4;
        marks[3] = 5;
        marks[4] = 66;
        marks[5] = 7;
        marks[6] = 8;
        int max = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
            System.out.println("maximum value = " + max);

    }
}

