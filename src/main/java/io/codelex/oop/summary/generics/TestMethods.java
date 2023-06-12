package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {
    public static void main(String[] args) {
        String cat = "Cat";
        int num = 234;
        //List<String> list = new ArrayList<>();
        //List<Integer> integers = new ArrayList<>();

        System.out.println(Combiner.combineTwoItems(cat, num));

        System.out.println("=+==+==+==+==+==+==+==+=");

        //Printer printer = new Printer(list);
        //printer.print();
        Printer printer2 = new Printer(cat);
        printer2.print();
        Printer printer3 = new Printer(num);
        printer3.print();
        //Printer printer4 = new Printer(integers);
        //printer4.print();
        System.out.println("=+==+==+==+==+==+==+==+=");

        StorageHouse storageHouse = new StorageHouse(cat);
        //storageHouse.addMoreItems(integers);
        storageHouse.addMoreItems(num);
        //storageHouse.addMoreItems(list);
        storageHouse.getMaybeFirstItem();
        storageHouse.printItems();
    }
}
