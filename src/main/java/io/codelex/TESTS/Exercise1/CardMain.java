package io.codelex.TESTS.Exercise1;

import java.math.BigDecimal;

public class CardMain {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("234 456 890 123", "Otto Brown", 334, new BigDecimal("20.0"));
        DebitCard debitCard = new DebitCard("234 564 8653 76789", "Anna BROWn", 234, new BigDecimal("3.0"));
        try {

            creditCard.addMoney(new BigDecimal("100"));
            creditCard.takeMoney(new BigDecimal("30.0"));
            System.out.println(creditCard.getBalance().toString());

            debitCard.addMoney(new BigDecimal("2.0"));
            debitCard.addMoney(new BigDecimal("10000.0"));
            System.out.println(debitCard.getBalance().toString());

        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

    }
}
