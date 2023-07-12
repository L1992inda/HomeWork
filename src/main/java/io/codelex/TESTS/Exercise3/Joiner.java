package io.codelex.TESTS.Exercise3;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String joinElements(List<T> list) {
        return list.stream().map(Object::toString).collect(Collectors.joining(separator));

    }
}
