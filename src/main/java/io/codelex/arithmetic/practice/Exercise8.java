package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {
        calculator(7.50,35);
        calculator(8.20,47);
        calculator(10.00,73);

    }

    public static void calculator(double basePay, double hoursWorked){
        if (hoursWorked > 60){
            System.out.println("Error");
        } else if (basePay < 8.00) {
            System.out.println("Error");
        }
        else
        {
            double hoursOverWorked = hoursWorked - 40;
            { double earnings = 40 * basePay + ( hoursOverWorked * (basePay * 1.5) );
                System.out.println("Employee has worked " + hoursWorked + " hours and earned $" + earnings + ".");
            }
        }
    }
}
