package io.codelex.oop.Computers;

public class Computer {
    int processor;
    int ram;
    int graphics;
    int card;
    String company;
    String model;

    public Computer(int processor, int ram, int graphics, int card, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphics = graphics;
        this.card = card;
        this.company = company;
        this.model = model;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGraphics() {
        return graphics;
    }

    public void setGraphics(int graphics) {
        this.graphics = graphics;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", graphics=" + graphics +
                ", card=" + card +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
