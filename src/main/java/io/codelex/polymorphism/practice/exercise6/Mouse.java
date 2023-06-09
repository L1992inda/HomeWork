package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Piipiipiii!");
    }

    @Override
    void eat(Food food) {

    }


    @Override
    public String toString() {
        return super.toString();
    }
}
