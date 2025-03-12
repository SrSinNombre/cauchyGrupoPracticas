package es.uah.matcomp.mp.e1;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest extends TestCase {
    public static void main(String[] args) {
        Customer A = new Customer(10,"a",'f');
        A.getGender();
        A.getName();
        A.getId();
    }
}