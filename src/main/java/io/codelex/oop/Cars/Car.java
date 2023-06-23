package io.codelex.oop.Cars;
import java.math.BigDecimal;


public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private Manufacturer manufacturer;
    private EngineType engineType;


    enum EngineType {
        V12, V8, V6, S6, S4, S3
    }

    public Car(String name, String model, double price, int yearOfManufacture, Manufacturer manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = BigDecimal.valueOf(price);
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
        this.engineType = engineType;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }


}

