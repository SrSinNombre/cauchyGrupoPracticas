package es.uah.matcomp.mp.e1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLineTest {
    private MyLine line;
    private MyPoint begin;
    private MyPoint end;

    @BeforeEach
    public void setUp() {
        begin = new MyPoint(0, 0);
        end = new MyPoint(3, 4);
        line = new MyLine(begin, end);
    }

    @Test
    public void testGetBegin() {
        assertEquals(begin, line.getBegin());
    }

    @Test
    public void testSetBegin() {
        MyPoint newBegin = new MyPoint(1, 1);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    public void testGetEnd() {
        assertEquals(end, line.getEnd());
    }

    @Test
    public void testSetEnd() {
        MyPoint newEnd = new MyPoint(5, 5);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    public void testGetBeginX() {
        assertEquals(0, line.getBeginX());
    }

    @Test
    public void testSetBeginX() {
        line.setBeginX(2);
        assertEquals(2, line.getBeginX());
    }

    @Test
    public void testGetBeginY() {
        assertEquals(0, line.getBeginY());
    }

    @Test
    public void testSetBeginY() {
        line.setBeginY(2);
        assertEquals(2, line.getBeginY());
    }

    @Test
    public void testGetEndX() {
        assertEquals(3, line.getEndX());
    }

    @Test
    public void testSetEndX() {
        line.setEndX(6);
        assertEquals(6, line.getEndX());
    }

    @Test
    public void testGetEndY() {
        assertEquals(4, line.getEndY());
    }

    @Test
    public void testSetEndY() {
        line.setEndY(8);
        assertEquals(8, line.getEndY());
    }

    @Test
    public void testGetBeginXY() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, line.getBeginXY());
    }

    @Test
    public void testSetBeginXY() {
        line.setBeginXY(2, 2);
        int[] expected = {2, 2};
        assertArrayEquals(expected, line.getBeginXY());
    }

    @Test
    public void testGetEndXY() {
        int[] expected = {3, 4};
        assertArrayEquals(expected, line.getEndXY());
    }

    @Test
    public void testSetEndXY() {
        line.setEndXY(6, 8);
        int[] expected = {6, 8};
        assertArrayEquals(expected, line.getEndXY());
    }

    @Test
    public void testGetLength() {
        assertEquals(5, line.getLength());
    }

    @Test
    public void testGetGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient());
    }

    @Test
    public void testToString() {
        String expected = "MyLine[begin=(0,0),end=(3,4)]";
        assertEquals(expected, line.toString());
    }
}