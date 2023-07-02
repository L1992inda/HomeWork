package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 5;
    }

    public void slowDown() {
        currentSpeed -= 5;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

}

