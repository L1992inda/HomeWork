package io.codelex.oop.Persons;

import java.time.LocalDate;

public class MainPersonClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Jon", "Abba", "Chief", LocalDate.of(2000, 5, 23));
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Ann", "Abba", "NK2117", 6);
        System.out.println(customer.getInfo());
    }
}
