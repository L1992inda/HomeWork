package io.codelex.oop.Persons;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private String id;
    private int age;

    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }


    public abstract String getInfo();
}
