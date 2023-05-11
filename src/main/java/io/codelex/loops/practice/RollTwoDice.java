package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random ran = new Random();
        int max = 6;
        int sum = 0;


        Scanner in = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int userInput = in.nextInt();

        while (sum != userInput) {

            int randomA = ran.nextInt(max) + 1;
            int randomB = ran.nextInt(max) + 1;

            sum = randomA + randomB;

            System.out.println(randomA + " and " + randomB + " = " + sum);

            if (sum == userInput) {
                break;
            }
        }

    }
}
