package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = input.nextInt();
        System.out.print("Enter number B: ");
        int b = input.nextInt();
        System.out.print("Number sum: " + num(a, b));

    }

    public static boolean num(int a, int b) {
        if (a == 15 || b == 15) {
            return true;
        }

        return (a + b == 15 || a - b == 15);
    }
}

