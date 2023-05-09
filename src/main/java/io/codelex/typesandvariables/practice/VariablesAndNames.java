package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {

        int Cars = 100;
        int CarSeats = 4;
        int Drivers = 30;
        int Passengers = 90;
        int CarsNotDriven = Cars - Drivers;
        int CarpoolCapacity = Drivers * CarSeats;
        int CarAveragePassenger = Passengers / Drivers;

        System.out.println("There are " + Cars + " cars available.");
        System.out.println("There are only " + Drivers + " drivers available.");
        System.out.println("There will be " + CarsNotDriven + " empty cars today.");
        System.out.println("We can transport " + CarpoolCapacity + " people today.");
        System.out.println("We have " + Passengers + " to carpool today.");
        System.out.println("We need to put about " + CarAveragePassenger + " in each car.");
    }
}