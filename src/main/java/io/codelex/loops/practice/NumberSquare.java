package io.codelex.loops.practice;

public class NumberSquare {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++) {
                System.out.print(k + min);
            }
            System.out.println();
        }

    }
}
