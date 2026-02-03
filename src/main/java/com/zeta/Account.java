package com.zeta;

public abstract class Account {
    private float balance ;
    private final int number;
    private ACCOUNT_TYPE accountType;

    public Account(int number){
        this.number = number;
    }
    public abstract float deposite(float amount);

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    public int getNumber() {
        return number;
    }

}
