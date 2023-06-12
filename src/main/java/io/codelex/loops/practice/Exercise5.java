package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word 'A': ");
        String wordA = in.next();
        System.out.print("Enter word 'B': ");
        String wordB = in.next();
        String dot = ".";


        int diff = wordA.length() + wordB.length();
        int line = 30 - diff;

        System.out.println(wordA + dot.repeat(line) + wordB);

    }
}
