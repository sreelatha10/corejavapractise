package com.ja.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("eee");
        String middlElement = list.get(list.size() / 2);
        System.out.println(middlElement);


    }

}
