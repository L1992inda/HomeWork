package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> car = new ArrayList<>();
        car.add("Audi");
        car.add("BMW");
        car.add("Honda");
        car.add("Mercedes");
        car.add("VolksWagen");
        car.add("Mercedes");
        car.add("Tesla");

        for (String element : car) {
            System.out.println(element);
        }

        System.out.println();

        //todo - replace array with a HashSet and print out the results
        HashSet<String> car2 = new HashSet<String>();
        car2.add("Audi");
        car2.add("BMW");
        car2.add("Honda");
        car2.add("Mercedes");
        car2.add("VolksWagen");
        car2.add("Mercedes");
        car2.add("Tesla");
        for (String element : car2) {
            System.out.println(element);
        }

        System.out.println();


        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> carsOrigination = new HashMap<String, String>();
        carsOrigination.put("Audi", "Germany");
        carsOrigination.put("BMW", "Germany");
        carsOrigination.put("Honda", "Japan");
        carsOrigination.put("Mercedes", "Germany");
        carsOrigination.put("VolksWagen", "Germany");
        carsOrigination.put("Tesla", "USA");
        for (String key : carsOrigination.keySet()) {
            System.out.println("key: " + key + " value: " + carsOrigination.get(key));
        }


    }
}
