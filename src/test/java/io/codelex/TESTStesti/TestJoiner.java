package io.codelex.TESTStesti;

import io.codelex.TESTS.Exercise3.Joiner;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestJoiner {
    @Test
    public void testJoiner() {
        Joiner<Integer> joiner = new Joiner<>("-");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        String joined = joiner.joinElements(integerList);
        assertEquals("1-2", joined);

    }
}
