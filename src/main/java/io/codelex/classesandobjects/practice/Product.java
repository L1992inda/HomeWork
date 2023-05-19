package io.codelex.classesandobjects.practice;

public class Product {

    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public static void main(String[] args) {


        Product product = new Product("Logitech mouse", 70.00, 14);
        product.printProduct();

        product.setName("iPhone 5s");
        product.setPriceAtStart(999.99);
        product.setAmountAtStart(3);

        product.printProduct();

        product.setName("Epson EB-U05");
        product.setPriceAtStart(440.46);
        product.setAmountAtStart(1);

        product.printProduct();
    }


    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println("'" + this.name + "'" + ", " + this.priceAtStart + " EUR, " + this.amountAtStart + "units.");
    }

}
