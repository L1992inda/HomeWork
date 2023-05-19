package io.codelex.classesandobjects.practice;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;


    }

    public void fillUp(double currentOdo, double litersUsed) {
        this.endKilometers = currentOdo;
        this.liters = litersUsed;


    }

    double calculateConsumption() {
        return (endKilometers - startKilometers / liters);
    }

    String carFuelUsage() {
        if (calculateConsumption() < 5) {
            System.out.println("Economy car!");
        } else if (calculateConsumption() > 15) {
            System.out.println("car is a gas hog!");
        }
        return "";
    }
}
