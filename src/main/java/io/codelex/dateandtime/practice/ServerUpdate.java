package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class ServerUpdate {

    public static void main(String[] args) {


        LocalDate serverUpdate = LocalDate.of(2019, 5, 1);
        LocalDate Update = serverUpdate.plusDays(14);
        LocalDate nextUpdate = Update.plusDays(14);

        /*Scanner in = new Scanner(System.in);
            System.out.println("Enter year");
            int yearChange = in.nextInt();
            System.out.println("Enter month");
            int monthChange = in.nextInt();

         LocalDate yearMonthChange = serverUpdate.withYear(yearChange).withMonth(monthChange);*/

        System.out.println("Updates: " + Update + "\nnext updates: " + nextUpdate);


    }
}
