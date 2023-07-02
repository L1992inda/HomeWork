package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write string: ");
        String userString = input.nextLine();
        int upperCase = 0;
        for (int i = 0; i < userString.length(); i++) {
            char chart = userString.charAt(i);
            if (Character.isUpperCase(chart)) {
                upperCase++;
            }

        }
        System.out.print("Uppercase used: " + upperCase);
    }
}
