package com.zeta;

import com.zeta.exception.InvalidTransferException;
import com.zeta.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {

    public SavingsAccount(int number) {
        super(number);
    }

    @Override
    public float deposite(float amount) {

        try {
            float newBalance = this.getBalance();

            if (amount < 0) {
                throw new InvalidTransferException("Negative value is not allowed");
            }

            newBalance += amount;
            this.setBalance(newBalance);

            return newBalance;

        } catch (InvalidTransferException e) {
            System.err.println("Deposit failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error during deposit");
        }

        return this.getBalance();
    }

    public float withdraw(float amount) {

        try {
            float newBalance = this.getBalance();

            if (amount < 0) {
                throw new InvalidTransferException("Negative value is not allowed");
            }

            if (amount > newBalance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }

            newBalance -= amount;
            this.setBalance(newBalance);

            return newBalance;

        } catch (InvalidTransferException e) {
            System.err.println("Withdrawal failed: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Withdrawal failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error during withdrawal");
        }

        return this.getBalance();
    }
}