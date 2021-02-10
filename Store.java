import java.util.ArrayList;

/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store
{
    public ArrayList<Customer> customers;
    
    public Store() {
        this.customers = new ArrayList<Customer>();
    }

    public void addSale(String customerName, double amount){
        boolean customerExists = false;
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                customerExists = true;
            }
        }
        
        
    }

    public String nameOfBestCustomer() {
        String bestCust = customers.get(0).getName();
        double bestCustAmount = customers.get(0).getAmount();

        for (Customer c : customers) {
            if (c.getAmount() > bestCustAmount) {
                bestCust = c.getName();
                bestCustAmount = c.getAmount();
            }
        }

        return bestCust;
    }
}
