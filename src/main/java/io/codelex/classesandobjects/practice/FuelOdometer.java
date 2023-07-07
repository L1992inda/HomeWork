package io.codelex.classesandobjects.practice;

public class FuelOdometer {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(0, fuelGauge);

        for (int i = 0; i < fuelGauge.MAX_LITERS; i++) {
            fuelGauge.addFuel();
        }
        while (fuelGauge.getFuel() > 0) {
            odometer.addMileage();
            System.out.println("Mileage: " + odometer.getMileage());
            System.out.println("Fuel level: " + fuelGauge.getFuel());
        }
    }
}
