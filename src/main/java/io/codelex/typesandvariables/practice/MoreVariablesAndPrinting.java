package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, heightInches, weightLbs;
        double inchCm, heightToCm, lbsKg, weightToKg;

        name = "Zed A. Shaw";
        age = 35;
        heightInches = 74;
        weightLbs = 180;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        inchCm = 2.54f;
        heightToCm = heightInches * inchCm;
        lbsKg = 0.453592d;
        weightToKg = weightLbs * lbsKg;


        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + heightToCm + " inches tall.");
        System.out.println("He's " + weightToKg + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + heightToCm + ", and " + weightToKg
                + " I get " + (age + heightToCm + weightToKg) + ".");
    }
}