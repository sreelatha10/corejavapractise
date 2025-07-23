package com.ja.Abstract;

class currentaccount extends BankAccount {
    currentaccount(String accNum , double bal){
        super(accNum, bal);
    }

    @Override
    void calculteinterest() {
        System.out.println("currentaccounts do not earn interest");
    }
}
