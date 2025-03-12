package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CylinderTest {
    private Cylinder cylinder;

    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder(2.0, 5.0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(5.0, cylinder.getHeight());
    }

    @Test
    public void testSetHeight() {
        cylinder.setHeight(10.0);
        assertEquals(10.0, cylinder.getHeight());
    }

    @Test
    public void testGetVolume() {
        assertEquals(Math.PI * 4 * 5, cylinder.getVolume());
    }

    @Test
    public void testGetRadius() {
        assertEquals(2.0, cylinder.getRadius());
    }

    @Test
    public void testSetRadius() {
        cylinder.setRadius(3.0);
        assertEquals(3.0, cylinder.getRadius());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI * 9, cylinder.getArea());
    }

    @Test
    public void testToString() {
        String expected = "Cylinder[radius=2.0,height=5.0]";
        assertEquals(expected, cylinder.toString());
    }
}