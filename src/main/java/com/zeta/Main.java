package com.zeta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     SavingsAccount   account1 = new SavingsAccount(3030);
     account1.setBalance(3000);

        SavingsAccount   account2 = new SavingsAccount(3031);
        account2.setBalance(3300);

        System.out.println(account1.getNumber());
        System.out.println(account1.getBalance());

        System.out.println(account2.getNumber());
        System.out.println(account2.getBalance());

        System.out.println(account1.deposite(3000));

        Bank hdfc = new Bank("hdfc");
        hdfc.transfer(account1,account2,100);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
//   account.accountType= ACCOUNT_TYPE.SAVINGS;
    }
}