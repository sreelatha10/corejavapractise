package com.ja.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class List1 {
    public static void main(String[] args) {
        List<Integer> ab = new ArrayList<>();
        ab.add(100);
        ab.add(2);
        ab.add(36);
        ab.add(94);
        ab.add(57);
        ab.add(61);
        System.out.println(ab);
        Set<Integer> cd = new HashSet<>();
        cd.add(2);
        cd.add(8);
        cd.add(12);
        cd.add(98);
        cd.add(77);
        System.out.println(cd);
    }
}
