public class TestListaSE {
    public static void main(String[] args) {
        // Crear una lista de enteros
        ListaSE<Integer> lista = new ListaSE<>();

        // Agregar elementos a la lista
        System.out.println("Agregando elementos:");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        // Imprimir la lista
        System.out.println("Lista después de agregar elementos:");
        lista.imprimir();

        // Mostrar el número de elementos en la lista
        System.out.println("\nNúmero de elementos en la lista: " + lista.getNumElementos());

        // Eliminar un elemento de la lista (por ejemplo, 30)
        System.out.println("\nEliminando el elemento 30:");
        lista.delete(30);

        // Imprimir la lista después de la eliminación
        System.out.println("Lista después de eliminar el elemento 30:");
        lista.imprimir();

        // Mostrar el número de elementos en la lista después de eliminar un elemento
        System.out.println("\nNúmero de elementos en la lista después de eliminar 30: " + lista.getNumElementos());
    }
}

