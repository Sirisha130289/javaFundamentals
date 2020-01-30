package be.intecbrussel.collections.exercises.shoppingCart;

public class Customer implements Comparable<Customer> {
    private int customerID;
    private String customerName;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getCustomerName().compareTo(o.getCustomerName());
    }
}
