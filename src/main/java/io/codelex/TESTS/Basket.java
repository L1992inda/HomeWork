package io.codelex.TESTS;

import java.util.ArrayList;
import java.util.List;

public class Basket<Object> {
    private final List<Object> items;
    private int currentNumber = 0;

    public Basket() {
        items = new ArrayList<>(10);
    }

    public void addItem(Object item) throws BasketFullException {
        items.add(item);
        currentNumber++;
        if (currentNumber > 10) {
            throw new BasketFullException("Basket is full");
        }
    }

    public void removeItem(Object item) throws BasketEmptyException {
        items.remove(item);
        currentNumber--;
        if (currentNumber < 1) {
            throw new BasketEmptyException("Basket is empty");
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public List<Object> getItems() {
        return items;
    }
}

