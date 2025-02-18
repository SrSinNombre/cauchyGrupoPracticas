package es.uah.matcomp.mp.e1;

public class CircleImpl extends Shape{
    private double radius = 1.0;

    public CircleImpl(){
        super();
    }
    public CircleImpl(double radius){
        this.radius = radius;
    }
    public CircleImpl(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return String.format("Circle[]Shape[color=%s,filled=%b,radius=%f]", getColor(), isFilled(), radius);
    }
}
