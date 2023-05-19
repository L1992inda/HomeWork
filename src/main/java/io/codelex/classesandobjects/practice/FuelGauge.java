package io.codelex.classesandobjects.practice;

public class FuelGauge {

    final int MAX_LITERS = 70;
    private int fuel;

    public FuelGauge() {
    }

    public FuelGauge(int fuel) {
        if (fuel < MAX_LITERS) {
            this.fuel = fuel;
        } else {
            fuel = MAX_LITERS;
        }
    }

    public int getFuel() {
        return fuel;
    }

    public void addFuel() {
        if (fuel < MAX_LITERS) {
            fuel++;
        } else {
            System.out.println("LitresPerKm is full!");
        }
    }

    public void reduceFuel() {
        if (fuel > 0) {
            fuel--;
        } else {
            {
                System.out.println("LitresPerKm is empty!");
            }
        }
    }
}
