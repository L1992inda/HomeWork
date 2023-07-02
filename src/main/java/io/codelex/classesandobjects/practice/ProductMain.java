package io.codelex.classesandobjects.practice;

public class ProductMain {
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

}
