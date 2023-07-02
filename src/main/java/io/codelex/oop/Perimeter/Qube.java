package io.codelex.oop.Perimeter;

public class Qube extends ThreeDShape {
    public Qube(double height) {
        super(height);
    }

    @Override
    double calculateArea() {
        return 6 * height * height;
    }

    @Override
    double calculateVolume() {
        double heightSum = height * height * height;
        return heightSum;
    }
}
