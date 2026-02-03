package com.zeta;

public  class Bank {
    String name;

    public Bank(String name){
        this.name = name;
    }

    public boolean transfer(Account Sender,Account Reciever , float amount){
        float senderBalance = Sender.getBalance();
        float recieverBalance = Reciever.getBalance();

        if(amount > senderBalance){
            return false;
        }else{
            senderBalance -= amount;
            recieverBalance += amount;

            Sender.setBalance(senderBalance);
            Reciever.setBalance(recieverBalance);

            return true;
        }
    }
}
