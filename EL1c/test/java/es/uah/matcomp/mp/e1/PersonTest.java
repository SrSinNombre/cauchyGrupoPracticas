package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("John Doe", "123 Main St");
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", person.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("123 Main St", person.getAddress());
    }

    @Test
    public void testSetAddress() {
        person.setAddress("456 Elm St");
        assertEquals("456 Elm St", person.getAddress());
    }

    @Test
    public void testToString() {
        String expected = "Person[name=John Doe,address=123 Main St]";
        assertEquals(expected, person.toString());
    }
}