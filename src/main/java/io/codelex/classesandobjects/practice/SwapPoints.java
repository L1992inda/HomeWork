package io.codelex.classesandobjects.practice;

public class SwapPoints {

    private int pointX = 0;
    private int pointY = 0;

    public SwapPoints(int x, int y) {
        this.pointX = x;
        this.pointY = y;

    }

    public static void main(String[] args) {

        SwapPoints p1 = new SwapPoints(5, 2);
        SwapPoints p2 = new SwapPoints(-3, -6);

        int a = p1.pointX;
        System.out.println(a);
        int b = p1.pointY;

        int c = p2.pointX;
        int d = p2.pointY;

        int ac = a;
        a = c;
        c = b;
        b = d;
        b = ac;


        System.out.println("(" + a + ", " + d + ")");
        System.out.println("(" + b + ", " + c + ")");


    }
}
