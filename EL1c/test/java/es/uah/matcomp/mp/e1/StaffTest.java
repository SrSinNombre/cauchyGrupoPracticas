package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StaffTest {
    private Staff staff;

    @BeforeEach
    public void setUp() {
        staff = new Staff("John Doe", "123 Main St", "UAH", 50000.0);
    }

    @Test
    public void testGetSchool() {
        assertEquals("UAH", staff.getSchool());
    }

    @Test
    public void testSetSchool() {
        staff.setSchool("MIT");
        assertEquals("MIT", staff.getSchool());
    }

    @Test
    public void testGetPay() {
        assertEquals(50000.0, staff.getPay());
    }

    @Test
    public void testSetPay() {
        staff.setPay(60000.0);
        assertEquals(60000.0, staff.getPay());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", staff.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", staff.getAddress());
    }

    @Test
    public void testSetAddress() {
        staff.setAddress("456 Elm St");
        assertEquals("456 Elm St", staff.getAddress());
    }

    @Test
    public void testToString() {
        String expected = "Staff[Person[name=John Doe,address=123 Main St],school=UAH,pay=50000.000000]";
        assertEquals(expected, staff.toString());
    }
}