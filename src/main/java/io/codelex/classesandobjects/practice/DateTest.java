package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date("May", "Monday", 2023);
        date.setDay("tuesday");
        date.setMonth("June");
        date.setYear(2024);
        date.displayDate();

        Date dateGet = new Date("May", "Monday", 2023);
        System.out.println();
        System.out.println(dateGet.getDay());
        System.out.println(dateGet.getMonth());
        System.out.println(dateGet.getYear());

    }
}
