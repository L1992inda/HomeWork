package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of triangle:");
        int size = in.nextInt();

        triangle(size);
    }

    static void triangle(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(".");
            }
            for (int k = 0; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < num - i; j++) {
                System.out.print(".");
            }

            System.out.println();
        }
    }
}