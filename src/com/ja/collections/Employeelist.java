package com.ja.collections;

import java.util.ArrayList;
import java.util.List;


public class Employeelist {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee(1,"aaa");
        Employee employee2 = new Employee(2,"bbb");
        Employee employee3 = new Employee(3,"list");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println(list);

    }
}
