package io.codelex.TESTS;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, String ownerFullName, int CCV, double balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }


    @Override
    public void addMoney(double moneyAdd) {
        super.addMoney(moneyAdd);
        if (getBalance() > 10000) {
            System.out.println("Warning: Too much money");
        }
    }
}
