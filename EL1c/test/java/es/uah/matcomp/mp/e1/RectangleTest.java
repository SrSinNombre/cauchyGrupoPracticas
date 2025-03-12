package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle(2.0, 4.0, "blue", true);
    }

    @Test
    public void testGetWidth() {
        assertEquals(2.0, rectangle.getWidth());
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(3.0);
        assertEquals(3.0, rectangle.getWidth());
    }

    @Test
    public void testGetLength() {
        assertEquals(4.0, rectangle.getLength());
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(5.0);
        assertEquals(5.0, rectangle.getLength());
    }

    @Test
    public void testGetArea() {
        assertEquals(8.0, rectangle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(14.0, rectangle.getPerimeter());
    }

    @Test
    public void testToString() {
        String expected = "Rectangle[width=2.000000,length=4.000000,color=blue,filled=true]";
        assertEquals(expected, rectangle.toString());
    }

    @Test
    public void testGetColor() {
        assertEquals("blue", rectangle.getColor());
    }

    @Test
    public void testSetColor() {
        rectangle.setColor("green");
        assertEquals("green", rectangle.getColor());
    }

    @Test
    public void testIsFilled() {
        assertTrue(rectangle.isFilled());
    }

    @Test
    public void testSetFilled() {
        rectangle.setFilled(false);
        assertFalse(rectangle.isFilled());
    }
}