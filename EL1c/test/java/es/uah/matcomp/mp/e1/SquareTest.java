package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {
    private Square square;

    @BeforeEach
    public void setUp() {
        square = new Square(4.0, "blue", true);
    }

    @Test
    public void testGetSide() {
        assertEquals(4.0, square.getSide());
    }

    @Test
    public void testSetSide() {
        square.setSide(5.0);
        assertEquals(5.0, square.getSide());
    }

    @Test
    public void testSetWidth() {
        square.setWidth(6.0);
        assertEquals(6.0, square.getWidth());
        assertEquals(6.0, square.getLength()); // Ensure length is also updated
    }

    @Test
    public void testSetLength() {
        square.setLength(7.0);
        assertEquals(7.0, square.getLength());
        assertEquals(7.0, square.getWidth()); // Ensure width is also updated
    }

    @Test
    public void testToString() {
        String expected = "Square[Rectangle[Shape[color=blue,filled=true],width=4.00, length=4.00]";
        assertEquals(expected, square.toString());
    }

    @Test
    public void testGetColor() {
        assertEquals("blue", square.getColor());
    }

    @Test
    public void testSetColor() {
        square.setColor("green");
        assertEquals("green", square.getColor());
    }

    @Test
    public void testIsFilled() {
        assertTrue(square.isFilled());
    }

    @Test
    public void testSetFilled() {
        square.setFilled(false);
        assertFalse(square.isFilled());
    }
}