package com.ja.collections;

import java.util.ArrayList;

public class collectionmethods {
    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>();
        abc.add("apple");
        abc.add("banana");
        abc.add("grape");
        abc.add("orange");
        System.out.println(abc.add("red"));
        System.out.println(abc);
        System.out.println(abc.add("yellow"));
        System.out.println(abc);
        System.out.println(abc.add("green"));
        System.out.println(abc);
        System.out.println(abc.add("orange"));
        System.out.println(abc);
    }

}
