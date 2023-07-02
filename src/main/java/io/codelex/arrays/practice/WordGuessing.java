package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public class word_guessing {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] guesses = {
                    "rabbit", "facebook", "java", "fox", "game", "hello", "internet", "face"};

            boolean weArePlaying = true;
            while (weArePlaying) {
                System.out.println("=-=-=-=-=-=-=-=-=-=");
                int randomNumber = random.nextInt(guesses.length);
                char[] randomWordToGuess = guesses[randomNumber].toCharArray();
                int ammountOfGuesses = randomWordToGuess.length;
                char[] playerGuess = new char[ammountOfGuesses];

                for (int i = 0; i < playerGuess.length; i++) {
                    playerGuess[i] = '_';
                }

                boolean wordIsGuessed = false;
                int tries = 0;

                while (!wordIsGuessed && tries != ammountOfGuesses) {
                    System.out.print("Word: ");
                    print(playerGuess);
                    System.out.print("Enter a character: ");
                    char input = scanner.nextLine().charAt(0);
                    tries++;

                    if (input == '-') {
                        wordIsGuessed = true;
                        weArePlaying = false;
                    } else {
                        for (int i = 0; i < randomWordToGuess.length; i++) {
                            if (randomWordToGuess[i] == input) {
                                playerGuess[i] = input;
                            }
                        }

                        if (isTheWordGuessed(playerGuess)) {
                            wordIsGuessed = true;
                            System.out.println("Congratulations");
                            break;
                        }
                    }
                }
                if (!wordIsGuessed) {
                    System.out.println("You ran out of guesses.");
                    break;
                }

            }
            System.out.println("Game Over!");
        }


        public static void print(char[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static boolean isTheWordGuessed(char[] array) {
            boolean condition = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '_') {
                    condition = false;
                }
            }
            return condition;
        }
}}
