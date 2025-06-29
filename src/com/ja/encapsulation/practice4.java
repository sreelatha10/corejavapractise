package com.ja.encapsulation;

 class practice4 {
     public static void main(String[] args) {
         practice3 abc = new practice3();
         abc.setAccountNumber("123456");
         abc.setAccountName("union");
         abc.setbalance(100.00);
         System.out.println("accountnumber: " + abc.getAccountNumber());
         System.out.println("accountname: " + abc.getAccountName());
         System.out.println("balance: " + abc.getbalance());
     }


}
