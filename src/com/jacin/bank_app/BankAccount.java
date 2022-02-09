package com.jacin.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;

    public BankAccount(double openingDepositSavings,double openingDepositChecking ) {
        this.savingsOpeningDeposit = openingDepositSavings;
        this.checkingOpeningDeposit = openingDepositChecking;
        checkingBalance += this.checkingOpeningDeposit;
        savingsBalance += this.savingsOpeningDeposit;

    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void  checkingWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount > checkingBalance) {
            System.out.println("Checking: Not enough funds to withdraw " + withdrawalAmount);
            if (savingsBalance + checkingBalance >= withdrawalAmount) {
                System.out.println("You need to do a balance transfer from savings");
            }
        } else {
            checkingBalance -= withdrawalAmount;
        }
    }

    public void savingsWithdrawal (double withdrawalAmount) {
        if (withdrawalAmount > savingsBalance) {
            System.out.println("Savings: not enough funds to withdraw " + withdrawalAmount);
            if (savingsBalance + checkingBalance >= withdrawalAmount) {
                System.out.println("You need to do a balance transfer from checking first");
            }

    }else {
            savingsBalance -= withdrawalAmount;
        }
    }

    public void transferToChecking(double transferAmount) {
        if (savingsBalance > transferAmount) {
            savingsBalance -= transferAmount;
            checkingBalance += transferAmount;
            System.out.println("Transferring to savings " + transferAmount);
            System.out.println("Your remaining balance is " + getSavingsBalance());
            System.out.println("Your new checking balance is " + getCheckingBalance());

        } else {
            System.out.println("Unable to transfer: insufficient funds");
        }
    }

    public void transferToSavings(double transferAmount) {
        if (checkingBalance > transferAmount) {

            checkingBalance -= transferAmount;
            savingsBalance += transferAmount;
            System.out.println("Transferring to checking " + transferAmount);
            System.out.println("Your remaining balance is " + getCheckingBalance());
            System.out.println("Your new savings balance is " + getSavingsBalance());

        } else {
            System.out.println("Unable to transfer: insufficient funds");
        }
    }

    public void depositToSavings(double depositAmount) {
        savingsBalance += depositAmount;
    }

    public void depositToChecking(double depositAmount) {
        checkingBalance += depositAmount;
    }
}
