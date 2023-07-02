package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void hashSet() {
        Scanner in = new Scanner(System.in);
        Set<String> name = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter  name: ");
            String input = in.nextLine();
            name.add(input);
            if (input.isBlank()) {
                System.out.print("Unique name list contains: ");
                for (String el : name) {
                    System.out.print(" " + el);
                }
                break;
            }
        }

    }


}
