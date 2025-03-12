import java.awt.*;

public class Point_3D extends Point_2D {
private float z;
public Point_3D(float x, float y, float z) {
    super(x, y); // sirve para llamar al constructor de otra clase
    this.z = z;
}
public Point_3D() {
    super();
}
public float getZ() {
    return z;
}
public void setZ(float z) {
    this.z = z;
}
public void setXYZ(float x, float y, float z) {
    setX(x);
    setY(y);
    setZ(z);
}
public float[] getXYZ() {
    return new float[]{getX(), getY(), getZ()};
}
public String toString() {
    return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
}

}
