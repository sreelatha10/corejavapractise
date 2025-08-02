package com.ja.collections;

import java.util.LinkedList;

public class AndandDelete {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("000");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(list.size() / 2, "x");
        System.out.println("after adding : " + list);
        list.remove(list.size() / 2);
        System.out.println("after deleting : " + list);
    }
}
