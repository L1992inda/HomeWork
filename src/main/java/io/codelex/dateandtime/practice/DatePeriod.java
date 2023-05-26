package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private static LocalDate start;
    private static LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        DatePeriod.start = start;
        DatePeriod.end = end;
        if (end.isBefore(start)) {
            System.out.println("End is before start date");
        }
    }


    public static void main(String[] args) {


        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        //DatePeriod overlap = firstPeriod.intersection(secondPeriod);
    }
}