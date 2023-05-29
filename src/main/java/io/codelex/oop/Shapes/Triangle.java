package io.codelex.oop.Shapes;

public class Triangle extends Shapes {

    private final int width;
    private final int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    int getArea() {

        return (width * height) / 2;
    }

    @Override
    int getPerimeter() {
        return (height * 2) + width;
    }
}
