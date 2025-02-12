package es.uah.matcomp.mp.e1;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
        this.x = x;
        this.y = y;
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return String.format("(%d,%d)", x, y);
    }
    public double distance(int x, int y){
        double new_x = x - this.x;
        double new_y = y - this.y;
        return Math.sqrt(new_y*new_y + new_x*new_x);
    }
    public double distance(MyPoint another){
        double new_x = x - another.getX();
        double new_y = y - another.getY();
        return Math.sqrt(new_y*new_y + new_x*new_x);
    }
    public double distance(){
        return distance(new MyPoint());
    }
}
