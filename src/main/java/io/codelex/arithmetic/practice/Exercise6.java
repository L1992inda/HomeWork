package io.codelex.arithmetic.practice;

public class Exercise6 {
    public static void main(String[] args) {
        int x = 1;

        while (x <= 110) {
            boolean bool = false;
            if (x % 3 == 0) {
                bool = true;
                System.out.print("Coza");

            }
            else if (x % 5 == 0) {
                bool = true;
                System.out.print("Loza");

            }
            else if (x % 7 == 0) {
                bool = true;
                System.out.print("Woza");

            }
            if (!bool) {
                System.out.print(x);
            }
            System.out.print(" ");
            if (x % 11 == 0) {
                System.out.println();
            }
            x++;
        }
    }
}

