package io.codelex.arithmetic.practice;

public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        int b = 100;


        for (int i = a; i <= b; ++i) {
            sum += i;
        }
        int average = sum / (b - a + 1);
        System.out.println("The sum of " + a + " to " + b + " is " + sum);
        System.out.println("The average is " + average);
    }
}
