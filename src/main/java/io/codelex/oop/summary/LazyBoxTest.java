package io.codelex.oop.summary;

public class LazyBoxTest {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(LazyBoxTest::calculate);

        Integer contents = box.get();

        Integer contents2 = box.get();
    }

    public static Integer calculate() {
        return 200;
    }
    }
