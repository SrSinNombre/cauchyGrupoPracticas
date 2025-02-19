public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side){
        setWidth(side);
    }
    public void setLength(double side){
        setLength(side);
    }
    @Override
    public String toString(){
        return String.format("Square[Rectangle[Shape[color=%s,filled=%b],width=%f,length=%f]]", getColor(), isFilled(), getWidth(), getLength());
    }
}
