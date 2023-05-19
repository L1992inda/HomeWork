package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double balance;
    private double interestRate;

    private double lastAmountInterest = 0;

    public SavingsAccount(double startingBalance, double annualInterestRate) {
        this.balance = startingBalance;
        this.interestRate = annualInterestRate;
    }

    public double withdrawal(double withdrawal) {
        return balance - withdrawal;
    }

    public double deposit(double deposit) {
        return balance - deposit;
    }

    public double balance() {
        double monthlyInterestRate = interestRate / 12;
        double lastAmountInterest = monthlyInterestRate * balance;
        return balance += lastAmountInterest;

    }

    public double getAmountInterest() {
        return lastAmountInterest;
    }

    public double getBalance() {
        return balance;
    }
}
