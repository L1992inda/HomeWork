package io.codelex.classesandobjects.practice;

public class SwapPointsMain {
    public static void main(String[] args) {

        SwapPoints p1 = new SwapPoints(5, 2);
        SwapPoints p2 = new SwapPoints(-3, -6);

        int a = p1.getPointX();
        System.out.println(a);
        int b = p1.getPointY();

        int c = p2.getPointX();
        int d = p2.getPointY();

        int ac = a;
        a = c;
        c = b;
        b = d;
        b = ac;


        System.out.println("(" + a + ", " + d + ")");
        System.out.println("(" + b + ", " + c + ")");


    }
}
