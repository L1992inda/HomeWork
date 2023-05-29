package io.codelex.oop;

public class MeasurementConverter {


    public static void convertMToY(double value) {
        System.out.println(value * ConvertionType.YARDS_TO_METERS.getConverter());
    }

    public static void convertYToM(double value) {
        System.out.println(value * ConvertionType.METERS_TO_YARDS.getConverter());
    }

    public static void convertCmToInch(double value) {
        System.out.println(value * ConvertionType.CENTIMETERS_TO_INCHES.getConverter());
    }

    public static void convertInchToCm(double value) {
        System.out.println(value * ConvertionType.INCHES_TO_CENTIMETERS.getConverter());
    }

    public static void convertKmToMil(double value) {
        System.out.println(value * ConvertionType.KILOMETERS_TO_MILES.getConverter());
    }

    public static void convertMilToKm(double value) {
        System.out.println(value * ConvertionType.MILES_TO_KILOMETERS.getConverter());
    }
}
