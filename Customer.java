
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    private String name;
    private double totalAmount;
    
    public Customer(String initName, double amount) {
        this.name = initName;
        this.totalAmount = amount;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPurchase(double amount) {
        this.totalAmount += amount;
    }
    
    public double getAmount() {
        return this.totalAmount;
    }
}
