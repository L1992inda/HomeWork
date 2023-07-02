package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        int sum = 0;
        int max = 10;

        System.out.println("Welcome to Piglet!");

        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        while (true) {
            int random = ran.nextInt(max) + 1;
            System.out.println("You rolled a " + random + "!");

            if (random == 1) {
                System.out.println("You lost game.");
                break;
            }

            if (random > 1) {
                sum += random;

                System.out.print("roll again ? put 'Y' or 'N'");
                String user = in.next();

                if (user.equalsIgnoreCase("Y")) {

                } else if (user.equalsIgnoreCase("N")) {
                    System.out.println("You got " + sum + " points.");
                    break;
                }
            }


        }
    }
}
