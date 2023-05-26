package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class ScissorsPaperRockGame {
    public static void game() {
        Scanner in = new Scanner(System.in);
        Random n = new Random();
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Let us begin...");
        System.out.println("Scissor-Paper-Rock");

        System.out.println();

        while (true) {
            System.out.print(" Your turn:  scissor, paper, rock?");
            String userInput = in.next().toUpperCase();

            ScissorPaperStone player;
            try {
                player = ScissorPaperStone.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input!!!");
                continue;
            }

            ScissorPaperStone computerMove = ScissorPaperStone.values()[n.nextInt(ScissorPaperStone.values().length)];
            System.out.println("Computer turn: " + computerMove.getName());

            if (player.equals(computerMove)) {
                System.out.println("Tie!!");
            } else if (player.equals(ScissorPaperStone.ROCK) && computerMove.equals(ScissorPaperStone.SCISSOR) ||
                    player.equals(ScissorPaperStone.SCISSOR) && computerMove.equals(ScissorPaperStone.PAPER) ||
                    player.equals(ScissorPaperStone.PAPER) && computerMove.equals(ScissorPaperStone.ROCK)) {
                System.out.print("You Win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }


            System.out.print("Play agan? y/n: ");
            String playAgain = in.next().toLowerCase();
            if (playAgain.matches("n")) {
                System.out.println("Your score: " + playerScore);
                System.out.println("Computer score: " + computerScore);
                break;
            }
        }
    }
}
