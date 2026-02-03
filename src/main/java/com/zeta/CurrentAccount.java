package com.zeta;

public class CurrentAccount extends Account {
    public CurrentAccount(int number){
        super(number);
    }
    @Override
    public float deposite(float amount){
        return 0;
    }
    public float withdraw(float amount){
        return 0;
    }
}
