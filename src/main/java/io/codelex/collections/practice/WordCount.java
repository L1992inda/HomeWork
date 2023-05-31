package io.codelex.collections.practice;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;


        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        for (String l:lines) {
            lineCount ++;
            wordCount += l.split(" ").length;
            String stringClean = l.replaceAll("[^A-Za-z0-9]","");
            for (int i = 0; i<stringClean.length();i++){
                charCount ++;
            }
        }




        System.out.println("Line count: "+lineCount);
        System.out.println("Word count: "+wordCount);
        System.out.println("Char count: "+charCount);

     }
}
