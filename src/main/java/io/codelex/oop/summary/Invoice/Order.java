package io.codelex.oop.summary.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;


public class Order {

    private final ArrayList<SellableThing> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItems(Item item) throws BadFoodException {
        items.add(item);
        if (item instanceof FoodItem foodItem) {
            if (foodItem.getExpirationDate().isBefore(LocalDate.now())) {
                throw new BadFoodException("Expiration date less than today!");
            }
        }
    }

    public ArrayList<SellableThing> getItems() {
        return items;
    }

    public void itemsToString() {
        for (SellableThing item : items) {
            System.out.println(item.fullInfo());
        }
    }

}
