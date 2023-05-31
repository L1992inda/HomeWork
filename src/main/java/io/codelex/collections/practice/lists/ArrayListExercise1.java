package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise1 {

    //TODO: Write a Java program to create a new array list, add some elements (string) and print out the collection.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        //TODO: Add 5 colors to list
        colors.add("Red");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Black");

        System.out.println(colors);

        List<String> tea = new ArrayList<>();
        tea.add("Herbal");
        tea.add("Black");
        tea.add("Green");
        tea.add("White");
        System.out.println(tea);
    }

}
