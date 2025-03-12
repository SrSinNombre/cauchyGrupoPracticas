public class TestListaDE {
    public static void main(String[] args) {
        // Crear una lista doblemente enlazada de enteros
        ListaDE<Integer> lista = new ListaDE<>();

        // Agregar elementos a la lista
        System.out.println("Agregando elementos:");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        // Imprimir la lista después de agregar los elementos
        System.out.println("Lista después de agregar elementos:");
        lista.imprimir(); // 10 <-> 20 <-> 30 <-> 40 <-> 50
        System.out.println();  // Nueva línea

        // Mostrar el número de elementos en la lista
        System.out.println("Número de elementos en la lista: " + lista.getNumElementos());

        // Usar el iterador para recorrer la lista
        Iterador<Integer> iterador = lista.getIterador();
        System.out.println("Recorriendo la lista con el iterador:");
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }
        System.out.println();  // Nueva línea

        // Eliminar un elemento (por ejemplo, el 30)
        System.out.println("Eliminando el elemento 30:");
        lista.delete(30);

        // Imprimir la lista después de la eliminación
        System.out.println("Lista después de eliminar el elemento 30:");
        lista.imprimir(); // 10 <-> 20 <-> 40 <-> 50
        System.out.println();  // Nueva línea

        // Mostrar el número de elementos después de la eliminación
        System.out.println("Número de elementos en la lista después de eliminar 30: " + lista.getNumElementos());

        // Probar la reversa de la lista
        System.out.println("Revirtiendo la lista:");
        lista.reverse();
        lista.imprimir(); // 50 <-> 40 <-> 20 <-> 10
        System.out.println();  // Nueva línea

        // Eliminar la cabeza (10 después de revertir)
        System.out.println("Eliminando la cabeza:");
        lista.delete(50); // En este caso, después de revertir, la cabeza es 50
        lista.imprimir(); // 40 <-> 20 <-> 10
        System.out.println();  // Nueva línea

        // Eliminar la cola (10 después de revertir)
        System.out.println("Eliminando la cola:");
        lista.delete(10); // Después de revertir, la cola es 10
        lista.imprimir(); // 40 <-> 20
        System.out.println();  // Nueva línea
    }
}

