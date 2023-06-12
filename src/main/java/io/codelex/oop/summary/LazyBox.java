package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox <T> {
    private Supplier<T> initializer;
    private T object;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get() {
        if (object == null) {
            object = initializer.get();
        }
        return object;
}}
