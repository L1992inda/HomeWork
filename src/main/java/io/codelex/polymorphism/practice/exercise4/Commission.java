package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSalesMade;
    private final double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        totalSalesMade += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSalesMade);
        totalSalesMade = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales " + totalSalesMade;
        return result;

    }
}
