package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        int b = 10;


        for (int i = a; i <= b; ++i) {
            sum += i;
        }
        System.out.println("Factorial of number " + b + " is: " + sum);
    }
}
