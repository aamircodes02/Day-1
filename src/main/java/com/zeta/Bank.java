package com.zeta;

import com.zeta.exception.InvalidTransferException;
import com.zeta.exception.InsufficientBalanceException;
import com.zeta.exception.AccountNotFoundException;

public class Bank {

    String name;

    public Bank(String name) {
        this.name = name;
    }

    public boolean transfer(Account Sender, Account Reciever, float amount) {

        try {
            if (Sender == null || Reciever == null) {
                throw new AccountNotFoundException("Sender or Receiver account is null");
            }

            float senderBalance = Sender.getBalance();
            float recieverBalance = Reciever.getBalance();

            if (amount < 0) {
                throw new InvalidTransferException("Negative value is not allowed");
            }

            if (amount > senderBalance) {
                throw new InsufficientBalanceException("Insufficient balance in sender account");
            }

            senderBalance -= amount;
            recieverBalance += amount;

            Sender.setBalance(senderBalance);
            Reciever.setBalance(recieverBalance);

            return true;

        }
        catch (InvalidTransferException e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }
        catch (AccountNotFoundException e) {
            System.err.println("Transfer failed: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Unexpected error occurred during transfer");
        }

        return false;
    }
}