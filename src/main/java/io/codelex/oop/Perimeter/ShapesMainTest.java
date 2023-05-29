package io.codelex.oop.Perimeter;

public class ShapesMainTest {
    public static void main(String[] args) {
        Hexagon hexagon = new Hexagon(7);
        System.out.printf("Hexagon area: %.2f", hexagon.calculateArea());
        System.out.println();
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());

        Triangle triangle = new Triangle(5, 7);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(6, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Qube qube = new Qube(7);
        System.out.println("Qube area: " + qube.calculateArea());
        System.out.println("Qube volume: " + qube.calculateVolume());

        Cone cone = new Cone(5, 8);
        System.out.printf("Cone side length: %.2f", cone.lengthOfSide());
        System.out.println();
        System.out.printf("Cone area:%.2f ", cone.calculateArea());
        System.out.println();
        System.out.printf("Cone volume:%.2f ", cone.calculateVolume());


    }
}
