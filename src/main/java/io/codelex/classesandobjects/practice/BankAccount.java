package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.text.DecimalFormat;

public class BankAccount {

    public String name;
    public double balance;

    public static void main(String[] args) {



        BankAccount account = new BankAccount("Ben",17.25);

        account.withdraw(70);
        account.deposit(45);


        System.out.println(account.toString());
    }

    public BankAccount(String name,double balance){
        this.name = name;
        this.balance = balance;
    }



    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    DecimalFormat format = new DecimalFormat("$#,##0.00");
    @Override
    public String toString(){
        return name + ", " +format.format(balance);
    }

}
