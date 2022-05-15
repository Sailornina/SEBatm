package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("Antonella", 12345, 1000);
        Bank SEB = new Bank();
        SEB.addAccount(account);
        Prompt prompt = new Prompt();
        ATM myAmazingATM = new ATM(prompt);

        boolean cardInMachine = true;

        Account userAccount = null;
        while (userAccount == null) {

            int scannedAccountNumber = prompt.askAccountNumber();
            userAccount = SEB.getAccount(scannedAccountNumber);

            if (userAccount == null) {
                System.out.println("User account does not exist!");
            }
        }


        while (cardInMachine) {
            prompt.showMenu();
            int userChoice = prompt.askUserChoice();
            switch (userChoice) {
                case 1:
                    //Check the balance
                    myAmazingATM.checkBalance(userAccount);
                    break;
                case 2:
                    myAmazingATM.withdrawMoney(userAccount);
                    break;
                case 3:
                    cardInMachine = false;
                    System.out.println("Thanks for using SEB!");
                    break;
                default:
                    break;
            }
        }
    }
}
