public class InvoiceTestin {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "Hammer", 2, 15.50);
        Invoice invoice2 = new Invoice("5678", "Wrench", 5, 10.00);

        System.out.println("Invoice 1:");
        printInvoiceDetails(invoice1);

        System.out.println("\nInvoice 2:");
        printInvoiceDetails(invoice2);

        // Test setters
        invoice1.setQuantity(-1); // Should set quantity to 0
        invoice1.setPricePerItem(-5.0); // Should set price to 0.0
        System.out.println("\nInvoice 1 (after invalid quantity and price):");
        printInvoiceDetails(invoice1);

        invoice2.setQuantity(10);
        invoice2.setPricePerItem(12.75);
        System.out.println("\nInvoice 2 (after valid quantity and price):");
        printInvoiceDetails(invoice2);
    }

    private static void printInvoiceDetails(Invoice invoice) {
        System.out.printf("Part Number: %s%n", invoice.getPartNumber());
        System.out.printf("Part Description: %s%n", invoice.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price Per Item: %.2f%n", invoice.getPricePerItem());
        System.out.printf("Invoice Amount: %.2f%n", invoice.getInvoiceAmount());
    }
}
