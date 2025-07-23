package com.ja.Abstract;

class SavingsAccount extends BankAccount{
    SavingsAccount(String accNum , double bal) {
        super(accNum, bal);
    }

    @Override
    void calculteinterest() {
        double interest = balance*0.06;
        System.out.println("Savings account interest : " + interest);

    }
}



