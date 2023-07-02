package io.codelex.PapildusMD;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private BigDecimal salary;
    private LocalDate date;

    public Employee(String name, BigDecimal salary, LocalDate date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getYearsOfService() {
        return Period.between(date, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}

