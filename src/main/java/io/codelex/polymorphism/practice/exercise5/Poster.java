package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final Integer numberOfCopies;
    private final Integer costPerCopy;

    public Poster(int fee, Integer numberOfCopies, Integer costPerCopy) {
        super(fee);
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + costPerCopy * numberOfCopies;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: " +
                "number of copies=" + numberOfCopies +
                " cost per Copy=" + costPerCopy + " ";
    }
}
