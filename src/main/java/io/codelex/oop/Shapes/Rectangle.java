package io.codelex.oop.Shapes;

public class Rectangle extends Shapes {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;

    }

    @Override
    int getArea() {
        return width * height;
    }

    @Override
    int getPerimeter() {
        return 2 * (width + height);
    }
}
