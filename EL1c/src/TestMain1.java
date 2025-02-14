import es.uah.matcomp.mp.e1.Circle;
import es.uah.matcomp.mp.e1.Cylinder;

public class TestMain1 { // save as "TestCylinder.java"
    public static void main(String[] args) {
// Declare and allocate a new instance of cylinder
// with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
// Declare and allocate a new instance of cylinder
// specifying height, with default color and radius
    }
}