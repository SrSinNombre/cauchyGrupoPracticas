package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceTest {
    private Invoice invoice;
    private CustomerBarney customer;

    @BeforeEach
    public void setUp() {
        customer = new CustomerBarney(1, "Barney", 10);
        invoice = new Invoice(1, customer, 100.0);
    }

    @Test
    public void testGetId() {
        assertEquals(1, invoice.getId());
    }

    @Test
    public void testGetCustomer() {
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    public void testSetCustomer() {
        CustomerBarney newCustomer = new CustomerBarney(2, "Fred", 15);
        invoice.setCustomer(newCustomer);
        assertEquals(newCustomer, invoice.getCustomer());
    }

    @Test
    public void testGetAmount() {
        assertEquals(100.0, invoice.getAmount());
    }

    @Test
    public void testSetAmount() {
        invoice.setAmount(200.0);
        assertEquals(200.0, invoice.getAmount());
    }

    @Test
    public void testGetCustomerId() {
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    public void testGetCustomerName() {
        assertEquals("Barney", invoice.getCustomerName());
    }

    @Test
    public void testGetCustomerDiscount() {
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    public void testGetAmountAfterDiscount() {
        assertEquals(90.0, invoice.getAmountAfterDiscount());
    }

    @Test
    public void testToString() {
        String expected = "Invoice[id=1, customer=CustomerBarney[id=1, name=Barney, discount=10], amount=100.0]";
        assertEquals(expected, invoice.toString());
    }
}