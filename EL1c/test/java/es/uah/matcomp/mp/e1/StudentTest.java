package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Jane Doe", "789 Maple St", "Computer Science", 2, 15000.0);
    }

    @Test
    public void testGetProgram() {
        assertEquals("Computer Science", student.getProgram());
    }

    @Test
    public void testSetProgram() {
        student.setProgram("Mathematics");
        assertEquals("Mathematics", student.getProgram());
    }

    @Test
    public void testGetYear() {
        assertEquals(2, student.getYear());
    }

    @Test
    public void testSetYear() {
        student.setYear(3);
        assertEquals(3, student.getYear());
    }

    @Test
    public void testGetFee() {
        assertEquals(15000.0, student.getFee());
    }

    @Test
    public void testSetFee() {
        student.setFee(16000.0);
        assertEquals(16000.0, student.getFee());
    }

    @Test
    public void testGetName() {
        assertEquals("Jane Doe", student.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("789 Maple St", student.getAddress());
    }

    @Test
    public void testSetAddress() {
        student.setAddress("1010 Oak St");
        assertEquals("1010 Oak St", student.getAddress());
    }

    @Test
    public void testToString() {
        String expected = "Student[Person[name=Jane Doe,address=789 Maple St],program=Computer Science,year=2,fee=15000.000000]";
        assertEquals(expected, student.toString());
    }
}