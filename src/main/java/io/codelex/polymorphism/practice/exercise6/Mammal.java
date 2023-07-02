package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    private final String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }


    @Override
    public String toString() {
        return super.toString() + livingRegion;
    }
}
