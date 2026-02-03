package com.zeta;

public class SavingsAccount extends Account {
    public SavingsAccount(int number){
        super(number);
    }
    @Override
    public float deposite(float amount){
        float newBalance = this.getBalance();
        if(amount < 0) {
            System.out.println("Negative value is not allowed");
            return  newBalance;
        }

        newBalance += amount;
        this.setBalance(newBalance);
        return newBalance;
    }
    public float withdraw(float amount){
        float newBalance = this.getBalance();
        if(amount < 0) {
            System.out.println("Negative value is not allowed");
            return  newBalance;
        }
        newBalance -= amount;
        this.setBalance(newBalance);
        return newBalance;
    }
}
