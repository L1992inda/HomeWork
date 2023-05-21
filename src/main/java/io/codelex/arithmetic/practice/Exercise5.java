package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Random randI = new Random();
        int randInt = randI.nextInt(100);
        int myRandInt = randInt + 1;
        //System.out.println("Random number between 1 and 100: "+myRandInt);

        Scanner input = new Scanner(System.in);
        System.out.print("I'm thinking of a number between 1-100.Try to guess it: ");
        int userInput = input.nextInt();

        if (myRandInt == userInput) {
            System.out.print("You guessed it!  What are the odds?!?");

        } else if (myRandInt > userInput) {
            System.out.print("Sorry, you are too high.  I was thinking of: " + myRandInt);

        } else {
            System.out.print("Sorry, you are too low.  I was thinking of: " + myRandInt);
        }
    }
}
