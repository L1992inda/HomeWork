package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        int userDistance = input.nextInt();
        System.out.print("Enter hr: ");
        int distanceHr = input.nextInt();
        System.out.print("Enter min: ");
        int distanceMin = input.nextInt();
        System.out.print("Enter sec: ");
        int distanceSec = input.nextInt();


        double time  = ((distanceHr * 3600) + (distanceMin * 60) + distanceSec);
        double metSec = userDistance / time;
        double kmH = (userDistance / 1000d ) / (time / 3600d);
        double milesH = kmH / 1.609d;

        System.out.println("Your speed in meters/second is: "+metSec);
        System.out.println("Your speed in km/h is: "+ kmH);
        System.out.println("Your speed in miles/h is: "+ milesH);

    }
}
