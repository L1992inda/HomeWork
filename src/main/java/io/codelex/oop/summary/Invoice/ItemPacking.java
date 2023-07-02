package io.codelex.oop.summary.Invoice;

public class ItemPacking implements Service {
    static final String name = "Item packing";
    static final double price = 5;


    @Override
    public String getPriceName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String priceToString() {
        return String.format("%.2f", price);
    }

    @Override
    public String fullInfo() {
        return getPriceName() + ", " + priceToString() + " EUR";
    }
}
