package io.codelex.TESTS.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> items;
    private int currentNumber = 0;

    public Basket() {
        items = new ArrayList<>(10);
    }

    public void addItem(T item) throws BasketFullException {
        items.add(item);
        currentNumber++;
        if (currentNumber > 10) {
            throw new BasketFullException("Basket is full");
        }
    }

    public void removeItem(T item) throws BasketEmptyException {
        items.remove(item);
        currentNumber--;
        if (currentNumber < 1) {
            throw new BasketEmptyException("Basket is empty");
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public List<T> getItems() {
        return items;
    }
}

