package Week03.Invoice;

public class Invoice {
  //variables
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double pricePerItem;

  //Check Invoice function
  public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
     this.partNumber = partNumber;
     this.partDescription = partDescription;
     this.quantity = quantity;
     this.pricePerItem = pricePerItem;
     if (quantity <= 0) {
        this.quantity = 0;
     }
     if (pricePerItem <= 0.0) {
        this.pricePerItem = 0.0;
     }
  }

  //getters and setters

  public String getPartNumber() {
     return partNumber;
  }

  public void setPartNumber(String partNumber) {
     this.partNumber = partNumber;
  }

  public String getPartDescription() {
     return partDescription;
  }

  public void setPartDescription(String partDescription) {
     this.partDescription = partDescription;
  }

  public int getQuantity() {
     return quantity;
  }

  public void setQuantity(int quantity) {
     this.quantity = quantity;
     if (quantity <= 0) {
        this.quantity = 0;
     }
  }

  public double getPricePerItem() {
     return pricePerItem;
  }

  public void setPricePerItem(double pricePerItem) {
     this.pricePerItem = pricePerItem;
     if (pricePerItem <= 0.0) {
        this.pricePerItem = 0.0;
     }
  }

  public double getInvoiceAmount() {
     return pricePerItem * quantity;
  }
}