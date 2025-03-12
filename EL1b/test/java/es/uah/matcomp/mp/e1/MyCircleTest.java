package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyCircleTest {
    private MyCircle circle;
    private MyPoint center;

    @BeforeEach
    public void setUp() {
        center = new MyPoint(0, 0);
        circle = new MyCircle(center, 5);
    }

    @Test
    public void testGetRadius() {
        assertEquals(5, circle.getRadius());
    }

    @Test
    public void testSetRadius() {
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    public void testGetCenter() {
        assertEquals(center, circle.getCenter());
    }

    @Test
    public void testSetCenter() {
        MyPoint newCenter = new MyPoint(10, 10);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    public void testGetCenterX() {
        assertEquals(0, circle.getCenterX());
    }

    @Test
    public void testSetCenterX() {
        circle.setCenterX(5);
        assertEquals(5, circle.getCenterX());
    }

    @Test
    public void testGetCenterY() {
        assertEquals(0, circle.getCenterY());
    }

    @Test
    public void testSetCenterY() {
        circle.setCenterY(5);
        assertEquals(5, circle.getCenterY());
    }

    @Test
    public void testGetCenterXY() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, circle.getCenterXY());
    }

    @Test
    public void testSetCenterXY() {
        circle.getCenterXY(5, 5);
        int[] expected = {5, 5};
        assertArrayEquals(expected, circle.getCenterXY());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI * 25, circle.getArea());
    }

    @Test
    public void testGetCircumference() {
        assertEquals(2 * Math.PI * 5, circle.getCircumference());
    }

    @Test
    public void testDistance() {
        MyCircle anotherCircle = new MyCircle(new MyPoint(3, 4), 5);
        assertEquals(5, circle.distance(anotherCircle));
    }

    @Test
    public void testToString() {
        String expected = "MyCircle=[radius=5,center=(0,0)]";
        assertEquals(expected, circle.toString());
    }
}