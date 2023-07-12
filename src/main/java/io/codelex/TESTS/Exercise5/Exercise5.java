package io.codelex.TESTS.Exercise5;

import java.util.Arrays;
import java.util.List;

import static io.codelex.TESTS.Exercise5.PartOfMethod.partOf;

public class Exercise5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String string) -> string.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer num) -> num % 2 == 1);
        System.out.println(evenPercent);


    }


}
