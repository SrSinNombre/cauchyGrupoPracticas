import es.uah.matcomp.mp.e1.MyPoint;

public class TestMain6a {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];

        // Inicializar puntos (1,1), (2,2)...(10,10)
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Crear matriz de distancias
        double[][] distances = new double[points.length][points.length];

        // Calcular distancias entre todos los puntos
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                distances[i][j] = points[i].distance(points[j]);
            }
        }

        // Mostrar matriz de distancias
        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                System.out.printf("%.2f ", distances[i][j]);
            }
            System.out.println();
        }
    }
}
