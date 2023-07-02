package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("IiiAaaa!");
    }

    @Override
    void eat(Food food) {
        System.out.println(food);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
