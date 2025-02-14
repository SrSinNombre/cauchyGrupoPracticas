package es.uah.matcomp.mp.e1;

import es.uah.matcomp.mp.e1.CustomerBarney;

public class Invoice {
    private int id;
    private CustomerBarney customer;
    private double amount;

    public Invoice(int id, CustomerBarney customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public CustomerBarney getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerBarney customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmound(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return id;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount * (1 - (customer.getDiscount() / 100.0));
    }

    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }

    public void setAmount(double v) {
        amount = v;
    }
}