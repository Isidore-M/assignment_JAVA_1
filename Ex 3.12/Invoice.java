public class Invoice {
     private String Number; 
     private String Description;
     private int Quantity = 0;
     private double Price = 0.0;
     private double Amount =0.0;

     public void setNumber(String Number) {
        this.Number = Number;
    }

     public void setDescription(String Description) {
        this.Description = Description;
    }

     public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

     public void setPrice(double Price) {
        this.Price = Price;
    }

     
     public String getNumber() {
         return Number; 
     }

     public String getDescription() {
         return Description; }

     public int getQuantity() {
         return Quantity; }

     public double getPrice() {
         return Price; }
        
     public double getInvoiceAmount( int Quantity, double Price) {
            Amount = Quantity*Price;
            return Amount;
        }

 }