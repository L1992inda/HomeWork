package io.codelex.classesandobjects.practice;

public class Date {
    private String month;
    private String day;
    private int year;

    public Date(String m, String d, int y) {
        this.month = m;
        this.day = d;
        this.year = y;

    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%s/%s/%d", day, month, year);

    }
}
