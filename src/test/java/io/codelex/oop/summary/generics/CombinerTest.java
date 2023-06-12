package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinerTest {

    @Test
    public void testCombiner() {
        String first = "Cat";
        int second = 234;
        String expectedResult = "First item: " + first + "; Second item: " + second;
        Object actualResult = Combiner.combineTwoItems(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
