package io.codelex.TESTS;

public class BasketTest {
    public static void main(String[] args) {
        int number = 2;
        String string = "Ball";
        try {
            Basket basket = new Basket<>();

            basket.addItem(number);
            basket.addItem(string);
            System.out.println(basket.getCurrentNumber());
            basket.removeItem(number);
            basket.removeItem(string);
            System.out.println(basket.getCurrentNumber());
        } catch (BasketFullException | BasketEmptyException e) {
            System.out.println(e);
        }


    }
}
