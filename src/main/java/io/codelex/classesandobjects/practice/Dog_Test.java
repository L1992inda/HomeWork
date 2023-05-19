package io.codelex.classesandobjects.practice;

public class Dog_Test {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male", "Lady", "Rocky");
        Dog dog2 = new Dog("Rocky", "male", "Molly", "Sam");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male", "Lady", "Sparky");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female", "Molly", "Buster");

        System.out.println("Object dog1 : " + dog1);

        String toCoco = dog8.fathersName();
        System.out.println(toCoco);

        String toSparky = dog3.fathersName();
        System.out.println(toSparky);

        toCoco = String.valueOf(dog8.hasSameMother(dog2));
        System.out.println(toCoco);
    }
}
