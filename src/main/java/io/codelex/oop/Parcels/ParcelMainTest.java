package io.codelex.oop.Parcels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParcelMainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter Parcel length,width,height, weight: ");
            int length = in.nextInt();
            int widthh = in.nextInt();
            int height = in.nextInt();
            float weight = in.nextFloat();
            Parcel parcel = new Parcel(length, widthh, height, weight);
            System.out.print("Valid: " + parcel.validate());
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }

    }
}
