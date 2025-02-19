abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;

    public Shape(){
        this.color = color;
        this.filled = filled;
    }
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Boolean isFilled(){
        return filled;
    }
    public void setFilled(Boolean filled){
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    @Override
    public String toString(){
        return String.format("Shape[color=%s,filled=%b]", color, filled);
    }
}
