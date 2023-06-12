package io.codelex.oop.summary.Invoice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {

    private final LocalDate expirationDate;

    public FoodItem(String priceName, double price, LocalDate expirationDate) {
        super(priceName, price);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String expirationDateToString() {
        return expirationDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String getPriceName() {
        return super.getPriceName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "best before: " + expirationDateToString() + ".";
    }
}
