package com.ja.instance;

public class methodwithreturn {
    static String schoolname = "krps";
    String studentname = "abc";
    static void showschoolname() {
        System.out.println("schoolname: " + schoolname);
    }
    void showschoolinstance() {
        System.out.println("schoolname: " + schoolname);

        }
        static void showstudentfromstatic() {
            methodwithreturn obj = new methodwithreturn();
            System.out.println("student name:"+ obj.studentname);
    }
    void showstudentininstance() {
        System.out.println("studentname: " + studentname);

    }

    public static void main(String[] args) {
        showschoolname();
        showstudentfromstatic();

        methodwithreturn obj = new methodwithreturn();
        obj.showschoolinstance();
        obj.showstudentininstance();



    }
}
