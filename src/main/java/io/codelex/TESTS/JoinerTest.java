package io.codelex.TESTS;

public class JoinerTest {
    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<Integer>("-");
        String result = joiner.joinElements(1, 2, 3, 4);
        System.out.println(result);
    }
}
