package io.codelex.oop;

public enum ConvertionType {
    METERS_TO_YARDS(1.093),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.394),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621),
    MILES_TO_KILOMETERS(1.609);

    final double converter;

    ConvertionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
