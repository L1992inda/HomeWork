package io.codelex.arithmetic.practice;

public class Exercise6 {
    public static void main(String[] args) {
        //int x = 1;
        // boolean t = true;

        for (int x = 1; x <= 110; x++) {

            if (x % 3 == 0) {
                System.out.print(" Coza ");

            } else if (x % 5 == 0) {
                System.out.print(" Loza ");

            } else if (x % 7 == 0) {
                System.out.print(" Woza ");

            } else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
                System.out.print(" " + x);
            }


            if (x % 11 == 0) {
                System.out.println();
            }
        }
    }
}
