package io.codelex.TESTS;

public class CardMain {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("234 456 890 123", "Otto Fotto", 334, 234);
        DebitCard debitCard = new DebitCard("234 456 890 123", "Otto Fotto", 334, 233);

        try {
            creditCard.takeMoney(234);

            debitCard.takeMoney(233);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }


    }
}
