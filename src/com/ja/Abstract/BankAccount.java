package com.ja.Abstract;
abstract class BankAccount {
    String accountNumber ;
    double balance;

    BankAccount(String accNum, double bal) {
        accountNumber = accNum;
        balance = bal;
    }
    void deposit(double amount ){
        balance += amount;
        System.out.println("deposited : " + amount);
    }
    abstract void calculteinterest();

}

