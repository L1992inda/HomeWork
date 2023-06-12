package io.codelex.oop.summary.Invoice;

public class HouseholdItem extends AbstractItem {

    private final String color;

    public HouseholdItem(String priceName, double price, String color) {
        super(priceName, price);
        this.color = color;
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
        return super.fullInfo() + " color: " + color;
    }
}


