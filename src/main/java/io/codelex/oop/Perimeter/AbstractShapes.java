package io.codelex.oop.Perimeter;

public abstract class AbstractShapes {
    double width;
    double height;

    public AbstractShapes(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public AbstractShapes(double height) {
        this.height = height;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();
}
