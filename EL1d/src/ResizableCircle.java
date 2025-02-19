public class ResizableCircle extends CircleR implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public String toString(){
        return String.format("ResizableCircle[Circle[radius=%.2f]]", radius);
    }
    @Override
    public void resize(int percent){
        radius = radius * percent/100;
    }
}
