package io.codelex.oop.Persons;

import java.time.LocalDate;

public class Employee extends Person {
    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String position, LocalDate startedWorking) {
        super(firstName, lastName);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate dateNow = LocalDate.now();
        int yearNow = dateNow.getYear();
        int yerStart = startedWorking.getYear();
        return yearNow - yerStart;
    }

    @Override
    public String getInfo() {
        return "\"" + position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)\"";

    }
}
