package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleImplTest {
    private CircleImpl circle;

    @BeforeEach
    public void setUp() {
        circle = new CircleImpl(2.0, "blue", true);
    }

    @Test
    public void testGetRadius() {
        assertEquals(2.0, circle.getRadius());
    }

    @Test
    public void testSetRadius() {
        circle.setRadius(3.0);
        assertEquals(3.0, circle.getRadius());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI * 9, circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(2 * Math.PI * 3, circle.getPerimeter());
    }

    @Test
    public void testToString() {
        String expected = "Circle[]Shape[color=blue,filled=true,radius=2.000000]";
        assertEquals(expected, circle.toString());
    }

    @Test
    public void testGetColor() {
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetColor() {
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testIsFilled() {
        assertTrue(circle.isFilled());
    }

    @Test
    public void testSetFilled() {
        circle.setFilled(false);
        assertFalse(circle.isFilled());
    }
}