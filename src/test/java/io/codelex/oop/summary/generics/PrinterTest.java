package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrinterTest {
    @Test
    public void testPrinter() {
        String thingToPrint = "Cat";
        Object expectedResult = thingToPrint;
        String actualResult = thingToPrint;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
