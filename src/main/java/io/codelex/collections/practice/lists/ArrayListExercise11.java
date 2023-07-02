package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> words = new ArrayList<>();
        words.add("Red");
        words.add("Book");
        words.add("Car");
        words.add("Door");
        words.add("Ring");
        words.add("Phone");
        words.add("Bird");
        words.add("Black");
        words.add("Lion");
        words.add("Cat");

        System.out.println("List before changed  elements " + words);
        System.out.println();
        words.add(5, "Dog");
        System.out.println("List after changed 5 element" + words);
        System.out.println();
        words.add(words.size()-0, "Zebra");
        System.out.println("List after changed last element " + words);
        System.out.println();
        Collections.sort(words);
        System.out.println("List after sort: " + words);
        System.out.println();

        if (words.contains("Foobar")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        System.out.println();

        for (String word : words) {
            System.out.println(word);
        }


    }

}
