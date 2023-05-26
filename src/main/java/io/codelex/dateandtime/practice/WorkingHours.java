package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingHours {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);


        int workingHours = calculateHours(startDate, endDate);
        System.out.println("Total working hours: " + workingHours);
    }


    public static int calculateHours(LocalDate startDate, LocalDate endDate) {
        int workingHours = 0;
        LocalDate currentDate = startDate;

        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingHours += 8;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingHours;
    }
}

