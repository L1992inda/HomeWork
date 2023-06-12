package io.codelex.oop.summary.Invoice;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {


        try {
            FoodItem milk = new FoodItem("Milk", 0.75, LocalDate.of(2023, 07, 05));
            ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
            HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");
            ItemPacking itemPacking = new ItemPacking();

            Order orderList = new Order();

            orderList.addItems(milk);
            orderList.addItems(radio);
            orderList.addItems(bucket);



            Invoice invoice = new Invoice(orderList, "INV234");


            invoice.formatInvoice(milk.fullInfo(), radio.fullInfo(), bucket.fullInfo(), itemPacking.fullInfo());
        } catch (WrongOrderException | BadFoodException e) {
            System.out.println(e);
        }


    }
}
