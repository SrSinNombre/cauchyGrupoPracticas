public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.Customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmound(double amount) {
        this.amount = amount
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getCustomerName() {
        return customerName;
    }
    public int getCustomerDiscount() {
        return customerDiscount;
    }
    public double getAmountAfterDiscount() {
        return amount * (1 - (customer.getDiscount() / 100.0));
    }
    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }
