package com.company;

public class ATM {

    public final Prompt prompt;

    public ATM(Prompt prompt) {
        this.prompt = prompt;
    }

    public void checkBalance(Account account){
        int bal = account.getBalance();
        System.out.println("You balance is: " + bal);
    }

    public void withdrawMoney(Account account) {
        int amountToWithdraw = prompt.askAmountToWithdraw();

        if (amountToWithdraw > account.getBalance()) {
            System.out.println("Insufficient funds.");
            return;
        }

        account.withdraw(amountToWithdraw);
        System.out.println("Your new balance is: " + account.getBalance());
    }
}
