package io.codelex.oop.runners;

import java.util.Scanner;

public class RunnerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter time in minutes: ");
            double minutes = in.nextDouble();

            Runner.getFitnessLevel(minutes);
        } catch (IllegalArgumentException e) {
            System.out.print("Should be minutes. ");
        }
    }
}
