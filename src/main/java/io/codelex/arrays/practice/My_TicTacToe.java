package io.codelex.arrays.practice;

import java.util.Scanner;

public class My_TicTacToe {

    private final static String playerX = "X";
    private final static String playerO = "O";
    private final static String[][] table = new String[3][3];

    public static void main(String[] args) {

        emptyBoard();

        while (true) {
            notEquals();
            player1();

            if (table[0][0].equals(playerX) && table[0][1].equals(playerX) && table[0][2].equals(playerX)) {
                break; //System.out.println("You Win!");

            } else if (table[1][0].equals(playerX) && table[1][1].equals(playerX) && table[1][2].equals(playerX)) {
                System.out.println("You Win!");
                break;
            } else if (table[2][0].equals(playerX) && table[2][1].equals(playerX) && table[2][2].equals(playerX)) {
                System.out.println("You Win!");
                break;
            }
            if (table[0][0].equals(playerX) && table[1][0].equals(playerX) && table[2][0].equals(playerX)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][1].equals(playerX) && table[1][1].equals(playerX) && table[2][1].equals(playerX)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][2].equals(playerX) && table[1][2].equals(playerX) && table[2][2].equals(playerX)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][0].equals(playerX) && table[1][1].equals(playerX) && table[2][2].equals(playerX)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][2].equals(playerX) && table[1][1].equals(playerX) && table[2][0].equals(playerX)) {
                System.out.println("You Win!");
                break;
            }

            notEquals();

            player2();

            if (table[0][0].equals(playerO) && table[0][1].equals(playerO) && table[0][2].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[1][0].equals(playerO) && table[1][1].equals(playerO) && table[1][2].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[2][0].equals(playerO) && table[2][1].equals(playerO) && table[2][2].equals(playerO)) {
                System.out.println("You Win!");
                break;
            }
            if (table[0][0].equals(playerO) && table[1][0].equals(playerO) && table[2][0].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][1].equals(playerO) && table[1][1].equals(playerO) && table[2][1].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][2].equals(playerO) && table[1][2].equals(playerO) && table[2][2].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][0].equals(playerO) && table[1][1].equals(playerO) && table[2][2].equals(playerO)) {
                System.out.println("You Win!");
                break;
            } else if (table[0][2].equals(playerO) && table[1][1].equals(playerO) && table[2][0].equals(playerO)) {
                System.out.println("You Win!");
                break;
            }
        }
    }

    public static void emptyBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = " _ ";
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j]);
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

    public static void notEquals() {
        while (true) {
            if (table[0][0] != " _ " && table[0][1] != " _ " && table[0][2] != " _ " &&
                    table[1][0] != " _ " && table[1][1] != " _ " && table[1][2] != " _ " &&
                    table[2][0] != " _ " && table[2][1] != " _ " && table[2][2] != " _ ") {
                System.out.println("Game Over!");
            }
            break;
        }
    }

    public static void player1() {
        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Player 'X' turn!");
            System.out.print("'X', choose your row (1-3):");
            int row = input.nextInt();

            System.out.print("'X', choose your column (1-3):");
            int column = input.nextInt();

            if (table[row - 1][column - 1].equals(" _ ")) {

                table[row - 1][column - 1] = " " + playerX + " ";
            } else {
                System.out.print("Busy!");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(" | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(table[i][j]);
                    System.out.print(" | ");
                }
                System.out.println();
            }
            break;
        }

    }

    public static void player2() {
        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Player 'O' turn!");
            System.out.print("'O', choose your row (1-3):");
            int row = input.nextInt();

            System.out.print("'O', choose your column (1-3):");
            int column = input.nextInt();

            if (table[row - 1][column - 1].equals(" _ ")) {

                table[row - 1][column - 1] = " " + playerO + " ";
            } else {
                System.out.println("Busy!");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(" | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(table[i][j]);
                    System.out.print(" | ");
                }
                System.out.println();

            }
            break;
        }
    }
}
