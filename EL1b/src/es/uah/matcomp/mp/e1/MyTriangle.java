package es.uah.matcomp.mp.e1;

public class MyTriangle extends MyPoint {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString(){
        return String.format("Triangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
    }
    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String GetType(){
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)){
            return "Equilateral";
        }
        else if (v1.distance(v2) != v2.distance(v3) && v2.distance(v3) != v3.distance(v1) && v1.distance(v3) != v2.distance(v1)){
            return "Scalene";
        }
        else{
            return "Isosceles";
        }
    }
}
