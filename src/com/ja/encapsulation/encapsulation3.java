package com.ja.encapsulation;

public class encapsulation3 {
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 5 && age < 25) {
            System.out.println("valid age");
        } else {
            System.out.println("invalid age");
        }
    }
    public char getgrade() {
        return grade;
    }
    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("print invalid grade" + "");
        }
    }
}
