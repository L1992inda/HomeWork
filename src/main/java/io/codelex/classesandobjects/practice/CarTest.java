package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers);
        car.fillUp(endKilometers, liters);
        car.calculateConsumption();

        System.out.println("Kilometers per liter are : " + car.calculateConsumption());
        System.out.println();
    }

}
