package io.codelex.TESTS.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String ownerFullName, int CCV, BigDecimal balance) {
        super(cardNumber, ownerFullName, CCV, balance);
    }

    @Override
    public void takeMoney(BigDecimal moneyTake) throws NotEnoughFundsException {
        super.takeMoney(moneyTake);
        if (getBalance().compareTo(new BigDecimal("100.0")) < 0) {
            System.out.println("Warning: Low funds");
        }

    }
}
