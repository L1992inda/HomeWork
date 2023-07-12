package io.codelex.TESTS.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, String ownerFullName, int CCV, BigDecimal balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }


    @Override
    public void addMoney(BigDecimal moneyAdd) {
        super.addMoney(moneyAdd);
        if (getBalance().compareTo(new BigDecimal("10000.0")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
