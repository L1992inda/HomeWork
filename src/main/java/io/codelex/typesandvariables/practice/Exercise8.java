package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        double minutesToYears = (60 * 24 * 335);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int userInput = input.nextInt();
        double years = userInput / minutesToYears;
        double days = (userInput / 60.0) / 24.0;
        System.out.print(userInput + " minutes is " + years + " years " + days + " days");
    }
}
