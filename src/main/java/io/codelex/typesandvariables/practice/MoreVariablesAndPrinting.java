package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, HeightInches, WeightLbs;
        double InchCm,HeightToCm,LbsKg,WeightToKg;

        Name = "Zed A. Shaw";
        Age = 35;
        HeightInches = 74;
        WeightLbs = 180;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        InchCm = 2.54f;
        HeightToCm = HeightInches * InchCm;
        LbsKg = 0.453592d;
        WeightToKg = WeightLbs*LbsKg;


        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + HeightToCm + " inches tall.");
        System.out.println("He's " + WeightToKg + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + HeightToCm + ", and " + WeightToKg
                + " I get " + (Age + HeightToCm + WeightToKg) + ".");
    }
}