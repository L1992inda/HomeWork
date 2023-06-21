package io.codelex.TESTS.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class JoinerMain {
    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        joiner.joinElements(integerList);

    }
}
