package io.codelex.polymorphism.practice.exercise1;

public class Hyundai implements Car, CarExtraBoost {
    private Integer currentSpeed = 0;


    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 20;
    }


}
