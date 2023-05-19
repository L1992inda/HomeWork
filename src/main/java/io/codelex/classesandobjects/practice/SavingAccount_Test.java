package io.codelex.classesandobjects.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingAccount_Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double montDeposit;
        double monthWithdraw;
        double interestEarned = 0.0;
        double totalDeposit = 0;
        double totalWithdrawn = 0;

        System.out.print("How much money is in the account?: ");
        double startingBalance = in.nextDouble();

        System.out.print("Enter the annual interest rate:");
        double annualInterestRate = in.nextDouble();

        System.out.print("How long has the account been opened? ");
        double months = in.nextDouble();

        SavingsAccount account = new SavingsAccount(startingBalance, annualInterestRate);

        for (int i = 1; i <= months; i++) {

            System.out.print("Enter amount deposited for month: " + i + ": ");
            montDeposit = in.nextDouble();
            totalDeposit = account.deposit(montDeposit);

            System.out.print("Enter amount withdrawn for " + i + " month: ");
            monthWithdraw = in.nextDouble();
            totalWithdrawn = account.withdrawal(monthWithdraw);

            account.balance();

            interestEarned = account.getAmountInterest();


        }
        DecimalFormat format = new DecimalFormat("#,##0.00");

        System.out.println("Total deposited: $" + format.format(totalDeposit));
        System.out.println("Total withdrawn: $" + format.format(totalWithdrawn));
        System.out.println("Interest earned: $" + format.format(interestEarned));
        System.out.println("Ending balance: $" + format.format(account.balance()));

    }
}
