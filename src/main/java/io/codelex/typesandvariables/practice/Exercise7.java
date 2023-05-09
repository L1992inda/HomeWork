package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write string: ");
        String UserString = input.nextLine();
        int UpperCase = 0;
        for (int i = 0; i <UserString.length(); i++) {
            char chart = UserString.charAt(i);
            if(Character.isUpperCase(chart)){
                UpperCase++;
            }

        }
        System.out.print("Uppercase used: " + UpperCase);
    }
}
