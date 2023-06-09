package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private Integer foodEaten;


    public Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;

    }

    abstract void makeSound();

    abstract void eat(Food food);

    String getName() {
        return animalName;
    }


    @Override
    public String toString() {
        return animalType + " " + animalName + " " + animalWeight + " ";
    }
}
