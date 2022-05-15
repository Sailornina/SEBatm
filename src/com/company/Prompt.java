package com.company;

import java.util.Scanner;

public class Prompt {

    private final Scanner scanner = new Scanner(System.in);

    public int askAccountNumber() {
        System.out.print("Enter your account number: ");
        return scanner.nextInt();
    }

    public void promptWrongAccountNumber() {
        System.out.println("User account does not exist!");
    }

    public void showMenu(){
        System.out.println("Welcome to SEB ATM");
        System.out.println("What would you like to do?");
        System.out.println("1. Check my balance");
        System.out.println("2. Withdraw money from my account");
        System.out.println("3. Retrieve card");
    }

    public int askUserChoice() {
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }

    public int askAmountToWithdraw() {
        System.out.print("Type amount to withdraw: ");
        return scanner.nextInt();
    }
}
