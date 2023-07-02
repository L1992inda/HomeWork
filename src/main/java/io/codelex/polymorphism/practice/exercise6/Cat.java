package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private final String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww!!");
    }


    @Override
    void eat(Food food) {
        System.out.println(food);
    }

    @Override
    public String toString() {
        return super.toString() + " " + breed;
    }
}
