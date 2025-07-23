package com.ja.collections;

import java.util.ArrayList;

public class addalllist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(777);
        list1.add(999);
        System.out.println(list1);
        System.out.println(list.addAll(list1));
        System.out.println(list);
        System.out.println(list.addAll(list1));



    }

}
