package io.codelex.oop.Perimeter;

public class Rectangle extends AbstractShapes {

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);

    }

    @Override
    double calculateArea() {
        return width * height;

    }
}
