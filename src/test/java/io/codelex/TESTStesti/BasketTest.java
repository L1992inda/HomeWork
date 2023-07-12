package io.codelex.TESTStesti;

import io.codelex.TESTS.Exercise2.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void testAddItem() throws BasketFullException {
        Basket<Apple> apple = new Basket<>();

        apple.addItem(new Apple());
        assertEquals(1, apple.getCurrentNumber());
    }

    @Test
    public void testRemoveItem() throws BasketFullException {
        try {
            Basket<Mushroom> mushroom = new Basket<>();

            mushroom.addItem(new Mushroom());
            mushroom.removeItem(new Mushroom());

            assertEquals(0, mushroom.getCurrentNumber());
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testBasketFull() {
        try {
            Basket<Apple> apple = new Basket<>();

            for (int i = 0; i <= 10; i++) {
                apple.addItem(new Apple());
            }
            assertEquals(10, apple.getCurrentNumber());
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
    }
}


