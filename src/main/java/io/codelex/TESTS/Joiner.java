package io.codelex.TESTS;

public class Joiner<Object> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String joinElements(Object... elements) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            builder.append(elements[i].toString());
            if (i != elements.length - 1) {
                builder.append(separator);
            }
        }
        return builder.toString();
    }
}
