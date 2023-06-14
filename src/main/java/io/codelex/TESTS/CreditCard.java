package io.codelex.TESTS;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String ownerFullName, int CCV, double balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(double moneyTake) throws NotEnoughFundsException {
        super.takeMoney(moneyTake);
        if (getBalance() < 100) {
            System.out.println("Warning: Low funds");
        }

    }
}
