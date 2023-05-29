package io.codelex.oop.Cars;

import java.util.ArrayList;

public class Car {
    EngineType type;
    private final ArrayList<Manufacturer> manufacturers;
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;

    public Car(String name, String model, double price, int yearOfManufacture, ArrayList<Manufacturer> manufacturers, EngineType type) {
        this.name = name;
        this.manufacturers = manufacturers;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}


