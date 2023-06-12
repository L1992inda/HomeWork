package io.codelex.oop.summary.Invoice;

public class ElectronicsItem extends AbstractItem {


    private final int power;

    public ElectronicsItem(String priceName, double price, int power) {
        super(priceName, price);
        this.power = power;
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
        return super.fullInfo() + "power: " + power + "W.";
    }

}
