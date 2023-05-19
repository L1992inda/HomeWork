package io.codelex.classesandobjects.practice;

public class Account_Test {
    public static void main(String[] args) {



        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);
        Account mattsAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My account",0);

        Account A = new Account("A account",100);
        Account B = new Account("B account",0.0);
        Account C = new Account("C account",0.0);



        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println("=-=-=-=-="+"Withdrawal"+"=-=-=-=-=-=-=");

        Account.transfer(A,B,50.0);
        Account.transfer(B,C,25.0);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        mattsAccount.withdrawal(100.0);
        System.out.println("Matt's account balance is now: "+mattsAccount.balance());
        System.out.println("A account balance is now: "+A.balance());


        System.out.println("=-=-=-=-="+"After deposit"+"=-=-=-=-=-=-=");

        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        myAccount.deposit(100.0);
        System.out.println("My account balance is now: "+myAccount.balance());
        System.out.println("B account balance is now: "+B.balance());
        System.out.println("C account balance is now: "+C.balance());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}
