public class TestMain8 {
    public static void main(String[] args) {
        // Crear un objeto MyPoint para el centro de los círculos
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(7, 1);

        // Crear varios círculos usando diferentes constructores
        MyCircle circle1 = new MyCircle();  // Constructor por defecto
        MyCircle circle2 = new MyCircle(3, 4, 5);  // Constructor con coordenadas y radio
        MyCircle circle3 = new MyCircle(point1, 10);  // Constructor con MyPoint y radio

        // Mostrar los círculos creados
        System.out.println("Círculo 1: " + circle1);
        System.out.println("Círculo 2: " + circle2);
        System.out.println("Círculo 3: " + circle3);

        // Probar el método set y get para el radio
        circle1.setRadius(8);
        System.out.println("Círculo 1 después de cambiar radio: " + circle1);

        // Probar los métodos get y set para el centro
        System.out.println("Centro del Círculo 2: (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
        circle2.setCenterX(10);
        circle2.setCenterY(5);
        System.out.println("Nuevo centro del Círculo 2: (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");

        // Probar el cálculo del área y la circunferencia
        System.out.println("Área del Círculo 3: " + circle3.getArea());
        System.out.println("Circunferencia del Círculo 3: " + circle3.getCircumference());

        // Probar el método distance entre círculos
        double distance = circle2.distance(circle3);
        System.out.println("Distancia entre Círculo 2 y Círculo 3: " + distance);
    }
}
