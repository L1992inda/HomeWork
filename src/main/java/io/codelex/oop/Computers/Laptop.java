package io.codelex.oop.Computers;

public class Laptop extends Computer {
    String battery;

    public Laptop(String battery, int processor, int ram, int graphics, int card, String company, String model) {
        super(processor, ram, graphics, card, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", graphics=" + graphics +
                ", card=" + card +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
