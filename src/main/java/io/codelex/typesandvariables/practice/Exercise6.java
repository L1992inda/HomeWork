package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number : ");
        int nA = input.nextInt();
        System.out.print("Enter B number : ");
        int nB = input.nextInt();
        System.out.print("Enter C number : ");
        int nC = input.nextInt();
        int sum = nA+nB+nC;
        System.out.print(" ABC sum is:" + sum);

    }
}
