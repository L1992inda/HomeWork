package io.codelex.oop.Perimeter;

public class Hexagon extends AbstractShapes {

    public Hexagon(double height) {
        super(height);
    }

    @Override
    double calculatePerimeter() {
        return 6 * height;

    }

    @Override
    double calculateArea() {
        double sqrt = Math.sqrt(3);
        double sum = (3 * sqrt);
        return (sum * height) / 2;
    }
}
