package io.codelex.oop.Shapes;

public abstract class Shapes {
    private final int numSides;

    public Shapes(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract int getArea();

    abstract int getPerimeter();


}
