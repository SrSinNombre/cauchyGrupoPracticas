public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*length + 2*width;
    }
    @Override
    public String toString(){
        return String.format("Rectangle[Shape[color=%s,filled=%b],width=%f,length=%f]", getColor(),isFilled(),getWidth(),getLength());
    }
}
