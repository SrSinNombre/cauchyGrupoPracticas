public class CircleG implements GeometricObject {
    private double radius;

    public CircleG(double radius){
        this.radius = radius;
    }
    public String toString(){
        return String.format("Circle[radius=%.2f]", radius);
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
