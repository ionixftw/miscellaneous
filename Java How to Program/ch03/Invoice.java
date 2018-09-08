// solution to excercise 3.12 of java how to program
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    public Invoice (String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if ( quantity > 0 ) {
            this.quantity = quantity;
        }
        if ( price > 0.0 ) {
            this.price = price;
        }
    }
    public double getTotalInvoiceAmount() {
        return this.quantity * this.price;
    }
    public void setPartNumber( String partNumber ) {
        this.partNumber = partNumber;
    }
    public String getPartNumber () {
        return this.partNumber;
    }
    public void setPartDescription( String partDescription ) {
        this.partDescription = partDescription;
    } 
    public String getPartDescription() {
        return this.partDescription;
    } 
    public void setQuantity ( int quantity ) {
        if ( quantity > 0 ) {
            this.quantity = quantity;
        }
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setPrice( double price ) {
        if ( price > 0.0 ) {
            this.price = price;
        }
    }
    public double getPrice() {
        return this.price;
    }
    public static void main( String[] args ) {
        Invoice invoice = new Invoice ("BU.04.002.004.02111", "Brac University Study table",
            2, 123.23);
        System.out.printf("Item Part Number: %s %nItem Description: %s%nQuantity: %02d%nPrice: %.2f%n",
            invoice.getPartNumber(), invoice.getPartDescription(), invoice.getQuantity(),
            invoice.getPrice());
        System.out.println( "Total invoice amount: " + invoice.getTotalInvoiceAmount() );
    }
}