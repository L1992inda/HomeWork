package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100 + 1);

        }
        System.out.println("Array of ten random integers: " + Arrays.toString(myArray));


        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = myArray[i];
        }
        System.out.println("Copy of array: " + Arrays.toString(newArray));

        myArray[myArray.length - 1] = -7;

        System.out.println("Changed last value to a -7: " + Arrays.toString(myArray));


    }

}
