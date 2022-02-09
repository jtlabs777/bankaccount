package com.jacin.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(2000, 1000);

        System.out.println("Savings " + customerAcct.getSavingsBalance());
        System.out.println("Checking " + customerAcct.getCheckingBalance());

        System.out.println("Depositing to savings and checking");
        customerAcct.depositToSavings(2000);
        customerAcct.depositToChecking(2000);


        System.out.println("Savings " + customerAcct.getSavingsBalance());
        System.out.println("Checking " + customerAcct.getCheckingBalance());



        System.out.println("Withdrawing from checking and savings");
        customerAcct.checkingWithdrawal(500);
        customerAcct.savingsWithdrawal(2500);
        System.out.println("Checking " + customerAcct.getCheckingBalance());
        System.out.println("Savings " + customerAcct.getSavingsBalance());

        System.out.println("Initiating balance transfer to checking");
        customerAcct.transferToChecking(3000);

        System.out.println("Checking " + customerAcct.getCheckingBalance());
        System.out.println("Savings " + customerAcct.getSavingsBalance());

        System.out.println("Initiating balance transfer to savings");
        customerAcct.transferToSavings(2000);


        System.out.println("Savings " + customerAcct.getSavingsBalance());
        System.out.println("Checking " + customerAcct.getCheckingBalance());
    }
}
