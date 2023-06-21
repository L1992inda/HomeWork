package io.codelex.TESTS.Exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private String cardNumber;
    private String ownerFullName;
    private int CCV;
    private BigDecimal balance;


    public Card(String cardNumber, String ownerFullName, int CCV, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.ownerFullName = ownerFullName;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void addMoney(BigDecimal moneyAdd) {
        balance = balance.add(moneyAdd);

    }

    public void takeMoney(BigDecimal moneyTake) throws NotEnoughFundsException {
        balance = balance.subtract(moneyTake);
        if (moneyTake.compareTo(balance) == 1) {
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
