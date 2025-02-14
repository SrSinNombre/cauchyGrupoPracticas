public class TestMain7 {
    public static void main(String[] args) {
        // Crear dos objetos MyPoint que representarán los puntos de inicio y final de la línea
        MyPoint point1 = new MyPoint(2, 3);
        MyPoint point2 = new MyPoint(5, 7);
        MyPoint point3 = new MyPoint(10, 10);
        MyPoint point4 = new MyPoint(1, 1);

        // Crear un objeto MyLine utilizando los puntos MyPoint
        MyLine line1 = new MyLine(point1, point2);  // Usando el constructor con objetos MyPoint
        MyLine line2 = new MyLine(1, 2, 6, 8);     // Usando el constructor con coordenadas

        // Mostrar las líneas creadas
        System.out.println("Línea 1: " + line1);
        System.out.println("Línea 2: " + line2);

        // Probar los métodos get y set para los puntos de inicio y final
        System.out.println("Coordenadas de inicio de la Línea 1: (" + line1.getBeginX() + ", " + line1.getBeginY() + ")");
        System.out.println("Coordenadas de fin de la Línea 1: (" + line1.getEndX() + ", " + line1.getEndY() + ")");

        // Cambiar las coordenadas de la Línea 2
        line2.setBeginXY(3, 4);
        line2.setEndXY(8, 9);
        System.out.println("Línea 2 después de cambiar coordenadas: " + line2);

        // Obtener y mostrar la longitud de las líneas
        System.out.println("Longitud de la Línea 1: " + line1.getLength());
        System.out.println("Longitud de la Línea 2: " + line2.getLength());

        // Obtener y mostrar el gradiente (pendiente) de las líneas
        System.out.println("Gradiente de la Línea 1: " + line1.getGradient());
        System.out.println("Gradiente de la Línea 2: " + line2.getGradient());

        // Crear una nueva línea con diferentes puntos
        MyLine line3 = new MyLine(point3, point4);
        System.out.println("Línea 3: " + line3);
        System.out.println("Longitud de la Línea 3: " + line3.getLength());
        System.out.println("Gradiente de la Línea 3: " + line3.getGradient());
    }
}
