package io.codelex.oop;

import java.util.Scanner;

public class ConvertMainTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("* m - meters; y - yards; cm - centimeters;in - inches;km - kilometers, mil - miles;\nConvert from : ");
        String from = in.next().toLowerCase();
        System.out.print("Convert to: ");
        String to = in.next().toLowerCase();
        System.out.println("Enter number: ");
        double number = in.nextDouble();


        if (from.matches("m") && to.matches("y")) {
            MeasurementConverter.convertMToY(number);
        } else if (from.matches("y") && to.matches("m")) {
            MeasurementConverter.convertYToM(number);
        } else if (from.matches("cm") && to.matches("in")) {
            MeasurementConverter.convertCmToInch(number);
        } else if (from.matches("in") && to.matches("cm")) {
            MeasurementConverter.convertInchToCm(number);
        } else if (from.matches("km") && to.matches("mil")) {
            MeasurementConverter.convertKmToMil(number);
        } else if (from.matches("mil") && to.matches("km")) {
            MeasurementConverter.convertMilToKm(number);
        }
    }
}
