public class TestMain9 {
    public static void main(String[] args) {
        // Crear puntos para los vértices de los triángulos
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(3, 0);
        MyPoint point3 = new MyPoint(3, 4);

        MyPoint point4 = new MyPoint(0, 0);
        MyPoint point5 = new MyPoint(5, 0);
        MyPoint point6 = new MyPoint(2, 3);

        MyPoint point7 = new MyPoint(0, 0);
        MyPoint point8 = new MyPoint(4, 0);
        MyPoint point9 = new MyPoint(2, 2);

        // Crear instancias de MyTriangle utilizando los vértices
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);  // Triángulo rectángulo
        MyTriangle triangle2 = new MyTriangle(point4, point5, point6);  // Triángulo escaleno
        MyTriangle triangle3 = new MyTriangle(point7, point8, point9);  // Triángulo isósceles
        MyTriangle triangle4 = new MyTriangle(0, 0, 3, 0, 3, 3);       // Triángulo equilátero

        // Mostrar los triángulos creados
        System.out.println("Triángulo 1: " + triangle1);
        System.out.println("Triángulo 2: " + triangle2);
        System.out.println("Triángulo 3: " + triangle3);
        System.out.println("Triángulo 4: " + triangle4);

        // Mostrar el perímetro de cada triángulo
        System.out.println("Perímetro del Triángulo 1: " + triangle1.getPerimeter());
        System.out.println("Perímetro del Triángulo 2: " + triangle2.getPerimeter());
        System.out.println("Perímetro del Triángulo 3: " + triangle3.getPerimeter());
        System.out.println("Perímetro del Triángulo 4: " + triangle4.getPerimeter());

        // Mostrar el tipo de cada triángulo
        System.out.println("Tipo del Triángulo 1: " + triangle1.GetType());
        System.out.println("Tipo del Triángulo 2: " + triangle2.GetType());
        System.out.println("Tipo del Triángulo 3: " + triangle3.GetType());
        System.out.println("Tipo del Triángulo 4: " + triangle4.GetType());
    }
}