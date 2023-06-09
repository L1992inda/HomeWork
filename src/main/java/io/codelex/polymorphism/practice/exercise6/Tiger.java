package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    //private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        //this.livingRegion = livingRegion1;
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {

    }


    @Override
    public String toString() {
        return super.toString(); //+ livingRegion;
    }
}
