package io.codelex.TESTS.Exercise2;

public class BasketMain {
    public static void main(String[] args) throws BasketEmptyException, BasketFullException {

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addItem(new Apple());
        appleBasket.addItem(new Apple());


        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addItem(new Mushroom());
        mushroomBasket.addItem(new Mushroom());


    }
}
