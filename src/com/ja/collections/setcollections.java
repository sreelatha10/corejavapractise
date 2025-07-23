package com.ja.collections;

import java.util.ArrayList;

public class setcollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);



    }
}
