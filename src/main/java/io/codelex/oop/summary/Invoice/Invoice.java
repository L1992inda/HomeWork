package io.codelex.oop.summary.Invoice;

import java.util.ArrayList;

public class Invoice {
    private final String invoiceNumber;
    private InvoiceStatus status;
    private final double priceWithoutVAT;
    private final double priceWithVAT;
    private final ArrayList<SellableThing> items;


    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Empty invoice");
        }
        this.items = order.getItems();
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
        this.priceWithoutVAT = order.getItems().stream().map(x -> x.getPrice()).reduce(0.0, (a, b) -> a + b);
        this.priceWithVAT = priceWithoutVAT * 0.21;


    }


    public InvoiceStatus send() {
        return status = InvoiceStatus.SENT;
    }

    public void formatInvoice(Object one, Object two, Object three, Object four) {
        System.out.println("===================================================");

        System.out.printf("= %s %s %25s\n", "INVOICE NUMBER: ", invoiceNumber, "=");
        System.out.printf("= %s %s %31s\n", "STATUS: ", status, "=");
        System.out.printf("= %s %s %6s\n", "1.", one, "=");
        System.out.printf("= %s %s %16s\n", "2.", two, "=");
        System.out.printf("= %s %s %17s\n", "3.", three, "=");
        System.out.printf("= %s %s %23s\n", "4.", four, "=");
        System.out.printf("= %s %.2f %37s\n", "SUM: ", priceWithoutVAT, "=");
        System.out.printf("= %s %.2f %33s\n", "VAT(21%): ", priceWithVAT, "=");
        System.out.printf("= %s %.2f %35s\n", "TOTAL: ", priceWithVAT + priceWithoutVAT, "=");

        System.out.print("===================================================");
    }


}
