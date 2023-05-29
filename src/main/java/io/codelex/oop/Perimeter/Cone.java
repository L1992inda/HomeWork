package io.codelex.oop.Perimeter;

public class Cone extends ThreeDShape {
    static double pi = Math.PI;
    double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    public double lengthOfSide() {
        return Math.sqrt(radius * radius + height * height);
    }

    @Override
    double calculateArea() {
        return (Math.PI * radius) * Math.sqrt(radius * radius + height * height);
    }

    @Override
    double calculateVolume() {
        double radiusPi = pi * radius * radius;
        double radiusHeight = radiusPi * height;

        return radiusHeight / 3;
    }
}



