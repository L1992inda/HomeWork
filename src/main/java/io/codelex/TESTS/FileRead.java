package io.codelex.TESTS;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws FileNotFoundException {


        String path = "Text.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        System.out.println(line);
        scanner.close();

    }
}
