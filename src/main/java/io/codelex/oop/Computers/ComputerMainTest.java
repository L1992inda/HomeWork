package io.codelex.oop.Computers;

public class ComputerMainTest {
    public static void main(String[] args) {
        Computer asus = new Computer(7, 16, 12, 4, "Asus", "Asus TUF Gaming");
        System.out.println(asus);
        Computer lenovo = new Computer(5, 9, 2, 3, "Lenovo", "Lenovo ThinkPad");
        System.out.println(asus.equals(lenovo));
        System.out.println("Asus hashCode : " + asus.hashCode() + " Lenovo hashCode: " + lenovo.hashCode());

        Laptop msi = new Laptop("Li-ion 53.5 Wh", 12, 16, 8, 1, "MSI", "MSI Katana");
        System.out.println(msi);
        System.out.println(asus.equals(msi));
        System.out.println("Asus hashCode : " + asus.hashCode() + " MSI hashCode: " + msi.hashCode());

        Laptop msi2 = new Laptop("Li-ion 53.5 Wh", 12, 16, 8, 1, "MSI", "MSI Katana");
        msi2.setRam(12);
        System.out.println(msi.equals(msi2));
        System.out.println("Msi hashCode : " + msi.hashCode() + " MSI2 hashCode: " + msi2.hashCode());
        System.out.println(msi2);


    }
}
