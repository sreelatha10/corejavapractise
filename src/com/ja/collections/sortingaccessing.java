package com.ja.collections;

import java.util.ArrayList;
import  java.util.Collections;

public class sortingaccessing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(80);
        numbers.add(180);
        numbers.add(10);
        System.out.println("original list : " + numbers) ;
        Collections.sort(numbers);
        System.out.println("sorted list : " + numbers);
        System.out.println("first element : " + numbers.get(0));
        System.out.println("middle element : " + numbers.get(numbers.size() / 2));
        System.out.println("largest element : " + numbers.get(numbers.size() - 1));
    }
}
