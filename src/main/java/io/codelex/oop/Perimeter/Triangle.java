package io.codelex.oop.Perimeter;

public class Triangle extends AbstractShapes {

    public Triangle(double width, double height) {
        super(width, height);
    }

    @Override
    double calculatePerimeter() {
        return (height * 2) + width;
    }

    @Override
    double calculateArea() {
        return (width * height) / 2;
    }
}
