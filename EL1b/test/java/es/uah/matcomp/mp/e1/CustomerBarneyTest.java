package es.uah.matcomp.mp.e1;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerBarneyTest extends TestCase {
    public static void main(String[] args) {
        CustomerBarney A = new CustomerBarney(10, "a", 10);
        A.getId();
        A.getName();
        A.getDiscount();
        A.setDiscount(20);
    }
}