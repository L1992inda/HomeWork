package io.codelex.TESTS.Exercise4;


import java.io.IOException;


public class FileRead {

    public static void main(String[] args) throws IOException {
        try {

            FileReadMethod.reverseFile("src/main/resources/comparing/tournamentt.txt", "src/main/resources/comparing/tournament.txt");

        } catch (IOException e) {

            System.out.println("Something something went wrong: " + e);
        }

    }
}

