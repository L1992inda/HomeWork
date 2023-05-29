package io.codelex.oop.Perimeter;

public class ThreeDShape extends AbstractShapes {
    public ThreeDShape(double width, double height) {
        super(width, height);
    }

    public ThreeDShape(double height) {
        super(height);
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return 0;
    }

    double calculateVolume() {
        return 0;
    }
}
