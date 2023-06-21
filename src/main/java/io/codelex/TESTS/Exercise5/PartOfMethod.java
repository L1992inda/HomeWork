package io.codelex.TESTS.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOfMethod {

    public static <T> double partOf(List<T> list, Predicate<T> predicate) {
        double count = list.stream().filter(predicate).count();
        return count / list.size();
    }
}
