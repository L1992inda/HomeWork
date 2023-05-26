package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }

    }
}
