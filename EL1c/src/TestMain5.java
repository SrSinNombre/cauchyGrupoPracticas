import es.uah.matcomp.mp.e1.Square;
import es.uah.matcomp.mp.e1.CircleImpl;
import es.uah.matcomp.mp.e1.Shape;
import es.uah.matcomp.mp.e1.Rectangle;

public class TestMain5 {
    public static void main(String[] args) {
        // Probando la clase Shape
        System.out.println("### Test Clase Shape ###");
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape1); // Salida esperada: Shape[color=red,filled=true]
        System.out.println(shape2); // Salida esperada: Shape[color=blue,filled=false]
        shape1.setColor("green");
        shape1.setFilled(false);
        System.out.println("Color actualizado: " + shape1.getColor() + ", ¿Relleno? " + shape1.isFilled());

        // Probando la clase Rectangle
        System.out.println("\n### Test Clase Rectangle ###");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4.0, 5.0);
        Rectangle rect3 = new Rectangle(4.0, 5.0, "yellow", true);
        System.out.println(rect1); // Salida por defecto: Rectangle[width=1.000000,length=1.000000,color=red,filled=true]
        System.out.println(rect2); // Salida esperada: Rectangle[width=4.000000,length=5.000000,color=red,filled=true]
        System.out.println(rect3); // Salida esperada: Rectangle[width=4.000000,length=5.000000,color=yellow,filled=true]
        System.out.println("Área del rectángulo: " + rect3.getArea());
        System.out.println("Perímetro del rectángulo: " + rect3.getPerimeter());
        rect3.setWidth(6.0);
        System.out.println("Ancho del rectángulo actualizado: " + rect3.getWidth());

        // Probando la clase CircleImpl
        System.out.println("\n### Test Clase CircleImpl ###");
        CircleImpl circle1 = new CircleImpl();
        CircleImpl circle2 = new CircleImpl(2.5);
        CircleImpl circle3 = new CircleImpl(3.5, "orange", false);
        System.out.println(circle1); // Salida esperada: Circle[]Shape[color=red,filled=true,radius=1.000000]
        System.out.println(circle2); // Salida esperada: Circle[]Shape[color=red,filled=true,radius=2.500000]
        System.out.println(circle3); // Salida esperada: Circle[]Shape[color=orange,filled=false,radius=3.500000]
        System.out.println("Área del círculo: " + circle3.getArea());
        System.out.println("Perímetro del círculo: " + circle3.getPerimeter());
        circle3.setRadius(4.5);
        System.out.println("Radio del círculo actualizado: " + circle3.getRadius());

        // Probando la clase Square
        System.out.println("\n### Test Clase Square ###");
        Square square1 = new Square();
        Square square2 = new Square(4.0);
        Square square3 = new Square(5.0, "purple", true);
        System.out.println(square1); // Salida por defecto: Square[Rectangle[Shape[color=red,filled=true],width=1.00, length=1.00]
        System.out.println(square2); // Salida esperada: Square[Rectangle[Shape[color=red,filled=true],width=4.00, length=4.00]
        System.out.println(square3); // Salida esperada: Square[Rectangle[Shape[color=purple,filled=true],width=5.00, length=5.00]
        System.out.println("Lado del cuadrado: " + square3.getSide());
        square3.setSide(6.5);
        System.out.println("Lado del cuadrado actualizado: " + square3.getSide());
        System.out.println("Área del cuadrado: " + square3.getArea());
        System.out.println("Perímetro del cuadrado: " + square3.getPerimeter());
    }
}