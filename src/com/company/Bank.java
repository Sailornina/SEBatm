package com.company;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> allAccounts = new ArrayList<Account>();

    public void addAccount(Account account){
        this.allAccounts.add(account);
    }

    public Account getAccount(int accountNumber){
        for(Account account : allAccounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
}
