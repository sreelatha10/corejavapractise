package com.ja.collections;

import java.util.ArrayList;

public class storingaccessing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 50 ; i < 500; i++){
            list.add(i);
            Integer integer = list.get(400);
            System.out.println(integer);
        }
    }
}
