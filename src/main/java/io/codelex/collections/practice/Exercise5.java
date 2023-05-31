package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {

    public static int isHappyNumber(int num) {
        int remainder = 0;
        int sum = 0;

        while (num > 0) {
            remainder = num % 10;
            sum += remainder * remainder;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();

        while (num != 1 && num != 4) {
            num = isHappyNumber(num);
        }

        if (num == 1) {
            System.out.println("Happy number");
        } else if (num == 4) {
            System.out.println("Not a happy number");
        }
    }

}
