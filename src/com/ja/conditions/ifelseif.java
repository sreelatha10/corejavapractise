package com.ja.conditions;

public class ifelseif {
     String name ;
     int pincode ;
     public ifelseif(String name, int pincode){
         this.name = name;
         this.pincode = pincode;
     }

    void add() {
String fulladdress = name + " , " + pincode;

        System.out.println("Name= " + name);
         System.out.println("Pincode = " + pincode);
    }
    public static void main(String[] args) {
        ifelseif abc = new ifelseif("sree" , 666);
        abc.add();
    }
}