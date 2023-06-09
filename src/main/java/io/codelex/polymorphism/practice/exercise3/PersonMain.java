package io.codelex.polymorphism.practice.exercise3;

public class PersonMain {
    public static void main(String[] args) {

        Student student = new Student("Anna", "Brown", "2025 M Street, Northwest, Washington,20036.", 123, 0.78);
        student.display();

        System.out.println();

        Employee employee = new Employee("Mark", "Rabbit", "2025 M Street, Northwest, Washington,20036.", 234, "Director");
        employee.display();

    }
}
