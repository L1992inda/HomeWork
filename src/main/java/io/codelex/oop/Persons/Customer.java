package io.codelex.oop.Persons;

public class Customer extends Person {
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int purchaseCount) {

        super(firstName, lastName, id);
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return "\"" + getFirstName() + " " + getLastName() + " " + getId() + " (" + purchaseCount + " Purchases)\"";

    }
}
