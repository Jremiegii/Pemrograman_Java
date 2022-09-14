package Payable;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    // four-argument constructor

    public Invoice(String part, String description, int count, double price) {
        
        partNumber = part;
        partDescription = description;
        setQuantity(count); // validate and store quantity
        setPricePerItem(price); // validate and store price per item
    } // end four-argument Invoice constructor
    //.....tambahkan method enkapsulasi // return String representation of Invoice object

    public String toString() {
        
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    } // end method toString
    // method required to carry out contract with interface Payable

    public double getPaymentAmount() {
        
        // calculate total cost
        return getQuantity() * getPricePerItem();
    } // end method getPaymentAmount

    /**
     * @return the partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the partDescription
     */
    public String getPartDescription() {
        return partDescription;
    }

    /**
     * @param partDescription the partDescription to set
     */
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the pricePerItem
     */
    public double getPricePerItem() {
        return pricePerItem;
    }

    /**
     * @param pricePerItem the pricePerItem to set
     */
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
