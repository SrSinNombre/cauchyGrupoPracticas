public class RectangleG implements GeometricObject{
    private double length;
    private double width;

    public RectangleG(double length, double width){
        this.width = width;
        this.length = length;
    }
    public String toString(){
        return String.format("Rectangle[length=%.2f,width=%.2f]", length, width);
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }
}
