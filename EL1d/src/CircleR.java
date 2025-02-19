public class CircleR implements GeometricObject{
    protected double radius;

    public CircleR(double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return String.format("Circle[radius=%.2f]", radius);
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
