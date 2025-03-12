package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    private Shape shape;

    @BeforeEach
    public void setUp() {
        shape = new Shape("blue", false);
    }

    @Test
    public void testGetColor() {
        assertEquals("blue", shape.getColor());
    }

    @Test
    public void testSetColor() {
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    public void testIsFilled() {
        assertFalse(shape.isFilled());
    }

    @Test
    public void testSetFilled() {
        shape.setFilled(true);
        assertTrue(shape.isFilled());
    }

    @Test
    public void testToString() {
        String expected = "Shape[color=blue,filled=false]";
        assertEquals(expected, shape.toString());
    }
}