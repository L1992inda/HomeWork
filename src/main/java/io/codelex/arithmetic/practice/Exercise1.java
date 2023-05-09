package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int A = input.nextInt();
        System.out.print("Enter number B: ");
        int B = input.nextInt();
        System.out.print("Number sum: " + num(A,B));

    }
    public static boolean num (int A, int B)
    {
        if(A == 15 || B == 15){
            return true;}

        return (A+B == 15 || A - B == 15);
    }
    }

