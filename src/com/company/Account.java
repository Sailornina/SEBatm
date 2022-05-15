package com.company;

public class Account {
    private int balance;
    private String name;
    private int accountNumber;

    public Account(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
}
