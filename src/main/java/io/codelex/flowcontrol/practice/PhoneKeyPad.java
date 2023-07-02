package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String string = in.next().toUpperCase();


        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (check == 'A' || check == 'B' || check == 'C') {
                System.out.print(2);
            } else if (check == 'D' || check == 'E' || check == 'F') {
                System.out.print(3);
            } else if (check == 'G' || check == 'H' || check == 'I') {
                System.out.print(4);
            } else if (check == 'J' || check == 'K' || check == 'L') {
                System.out.print(5);
            } else if (check == 'M' || check == 'N' || check == 'O') {
                System.out.print(6);
            } else if (check == 'P' || check == 'Q' || check == 'R' || check == 'S') {
                System.out.print(7);
            } else if (check == 'T' || check == 'U' || check == 'V') {
                System.out.print(8);
            } else if (check == 'W' || check == 'X' || check == 'Y' || check == 'Z') {
                System.out.print(9);
            } else {

                System.out.print("No matching key!");

            }
        }

       /* for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    System.out.print(2);
                    break;
                case 'D':
                case 'E':
                case 'F':
                    System.out.print(3);
                    break;
                case 'G':
                case 'H':
                case 'I':
                    System.out.print(4);
                    break;
                case 'J':
                case 'K':
                case 'L':
                    System.out.print(5);
                    break;
                case 'M':
                case 'N':
                case 'O':
                    System.out.print(6);
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    System.out.print(7);
                    break;
                case 'T':
                case 'U':
                case 'V':
                    System.out.print(8);
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    System.out.print(9);
                    break;
            }
        } */
    }

}
