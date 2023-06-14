package io.codelex.TESTS;

public abstract class Card {

    private String cardNumber;
    private String ownerFullName;
    private int CCV;
    private double balance;

    public Card(String cardNumber, String ownerFullName, int CCV, double balance) {
        this.cardNumber = cardNumber;
        this.ownerFullName = ownerFullName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void addMoney(double moneyAdd) {
        double allMoney = balance + moneyAdd;

    }

    public void takeMoney(double moneyTake) throws NotEnoughFundsException {
        double leftMoney = balance - moneyTake;
        if (leftMoney < 0.1) {
            throw new NotEnoughFundsException("Not enough money!");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
