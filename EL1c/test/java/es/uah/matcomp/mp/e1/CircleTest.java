package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {
    private Circle circle;

    @BeforeEach
    public void setUp() {
        circle = new Circle(2.0, "blue");
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
    public void testGetColor() {
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetColor() {
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI * 4, circle.getArea());
    }

    @Test
    public void testToString() {
        String expected = "Circle [radius=2.0,color=blue]";
        assertEquals(expected, circle.toString());
    }
}