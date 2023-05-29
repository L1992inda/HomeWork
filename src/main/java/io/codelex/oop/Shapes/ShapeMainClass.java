package io.codelex.oop.Shapes;

public class ShapeMainClass {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.getPerimeter();

        Triangle triangle = new Triangle(6, 8);
        triangle.getArea();
        triangle.getPerimeter();

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle sides: " + triangle.getNumSides());
    }
}
