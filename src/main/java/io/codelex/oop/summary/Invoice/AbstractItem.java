package io.codelex.oop.summary.Invoice;

public abstract class AbstractItem implements Item {

    private final String priceName;
    private final double price;

    public AbstractItem(String priceName, double price) {
        this.priceName = priceName;
        this.price = price;
    }


    public String getPriceName() {
        return priceName;
    }

    public String priceToString() {
        return String.format("%.2f", price);
    }

    public double getPrice() {
        return price;
    }


    public String fullInfo() {
        return priceName + ", " + priceToString() + " Eur,";
    }
}
