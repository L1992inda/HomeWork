package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height cm: ");
        int userHeight = input.nextInt();
        System.out.print("Enter your weight kg: ");
        int userWeight = input.nextInt();

        double userHeightM = userHeight * 0.01;
        double bmi = userWeight / Math.pow(userHeightM,2);

        System.out.print("Your  BMI is: " + bmi );

        if (bmi < 18.5){
            System.out.print(" underweight");

        } else if (bmi >= 18.5 && bmi < 24.9){
            System.out.print(" Healthy");

        } else if (bmi >= 24.9 && bmi < 30){
            System.out.print(" overweight");
        } else if (bmi >= 30){
            System.out.print(" Suffering from Obesity");}
    }
}
