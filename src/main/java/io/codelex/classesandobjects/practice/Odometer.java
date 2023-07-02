package io.codelex.classesandobjects.practice;

public class Odometer {
    private final static double MAX_MILEAGE = 999.999;
    private int mileage;
    private final static int L_PER_KM = 10;

    private int startMileage;

    private FuelGauge fuelGauge;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.startMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;

    }

    public int getMileage() {
        return mileage;
    }

    public void addMileage() {
        if (mileage < MAX_MILEAGE) {
            mileage++;
        } else if (mileage == MAX_MILEAGE) {
            mileage = 0;
        }

        int diff = startMileage - mileage;

        if (diff % L_PER_KM == 0) {
            fuelGauge.reduceFuel();

        }
    }
}


