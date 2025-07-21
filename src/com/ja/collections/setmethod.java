package com.ja.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class setmethod {
    public static void main(String[] args) {
        HashSet<String> abc = new HashSet<>();
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

