package es.uah.matcomp.mp.e1;

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString(){
        return String.format("Square[Rectangle[Shape[color=%s,filled=%b],width=%.2f, length=%.2f]", getColor(), isFilled(), getWidth(), getLength());
    }
}
