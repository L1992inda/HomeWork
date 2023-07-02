package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {


    public static void main(String[] args) {

        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        Hyundai hyundai = new Hyundai();
        Volvo volvo = new Volvo();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();

        List<Car> raceCarsList = new ArrayList<>();
        raceCarsList.add(tesla);
        raceCarsList.add(lexus);
        raceCarsList.add(hyundai);
        raceCarsList.add(volvo);
        raceCarsList.add(audi);
        raceCarsList.add(bmw);

        for (int i = 1; i <= 10; i++) {
            for (Car car : raceCarsList) {
                System.out.println(i + " Lap");
                car.startEngine();
                car.speedUp();

                if (i == 3 && car instanceof CarExtraBoost) {
                    ((CarExtraBoost) car).useNitrousOxideEngine();
                }
                if (i == 10) {
                    car.slowDown();
                }
                System.out.println("Speed: " + car.showCurrentSpeed());
            }

        }

        System.out.println("Race end!");
        Optional<Car> fastestCar = raceCarsList
                .stream()
                .max(Comparator.comparing(car -> car.getCurrentSpeed()));


        Integer fastestSpeed = raceCarsList
                .stream()
                .mapToInt(v -> v.getCurrentSpeed())
                .summaryStatistics()
                .getMax();
        System.out.println("Fastest car: " + fastestCar + " Speed: " + fastestSpeed);


    }
}





