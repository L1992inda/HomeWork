package io.codelex.PapildusMD;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Anna Jonan", 2000, LocalDate.of(2012, 5, 2));

        System.out.println(employee);
        System.out.println("Years of Service: " + employee.getYearsOfService());
    }
}

