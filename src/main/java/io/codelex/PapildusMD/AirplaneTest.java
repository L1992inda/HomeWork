package io.codelex.PapildusMD;

import java.time.LocalTime;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(5, 30));
        Airplane flight2 = new Airplane("KUI765", "Spain", LocalTime.of(10, 45));
        Airplane flight3 = new Airplane("JUX789", "Norway", LocalTime.of(9, 0));
        System.out.println("Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(0);
        flight2.delay(33);
        System.out.println("Current Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();

    }
}
