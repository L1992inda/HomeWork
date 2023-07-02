package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class AnimalMainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mammal[] animals = new Mammal[4];

        System.out.println("Enter animal Type: ");
        String animalType = in.next();


        if (animalType.equalsIgnoreCase("Cat")) {
            System.out.println("Enter animal name: ");
            String catName = in.next();
            System.out.println("Enter animal weight: ");
            double catWeight = in.nextDouble();
            System.out.println("Enter animal living region: ");
            String catRegion = in.next();
            System.out.println("Enter animal breed: ");
            String catBreed = in.next();
            animals[0] = new Cat(catName, animalType, catWeight, catRegion, catBreed);
            System.out.println(animals[0]);
            animals[0].makeSound();
        } else if (animalType.equalsIgnoreCase("Mouse")) {
            System.out.println("Enter animal name: ");
            String mouseName = in.next();
            System.out.println("Enter animal weight: ");
            double mouseWeight = in.nextDouble();
            System.out.println("Enter animal living region: ");
            String mouseRegion = in.next();
            animals[1] = new Mouse(mouseName, animalType, mouseWeight, mouseRegion);
            System.out.println(animals[1]);
            animals[1].makeSound();

        } else if (animalType.equalsIgnoreCase("Zebra")) {
            System.out.println("Enter  name: ");
            String zebraName = in.next();
            System.out.println("Enter weight: ");
            double zebraWeight = in.nextDouble();
            System.out.println("Enter living region: ");
            String zebraRegion = in.next();
            animals[2] = new Zebra(zebraName, animalType, zebraWeight, zebraRegion);
            System.out.println(animals[2]);
            animals[2].makeSound();

        } else if (animalType.equalsIgnoreCase("Tiger")) {
            System.out.println("Enter  name: ");
            String tigerName = in.next();
            System.out.println("Enter weight: ");
            double tigerWeight = in.nextDouble();
            System.out.println("Enter living region: ");
            String tigerRegion = in.next();
            animals[3] = new Tiger(tigerName, animalType, tigerWeight, tigerRegion);
            System.out.println(animals[3]);
            animals[3].makeSound();

        }

        Food meat = new Meat(1);
        Food vegetable = new Vegetable(1);


    }
}
