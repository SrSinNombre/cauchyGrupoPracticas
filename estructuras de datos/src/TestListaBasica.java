public class TestListaBasica {
    public static void main(String[] args) {
        // Crear una lista básica con un tamaño máximo de 5 elementos
        ListaBasica<Integer> lista = new ListaBasica<>(5);

        // Verificar que la lista está vacía
        System.out.println("Lista vacía: " + lista.estaVacia());  // Debería imprimir true

        // Añadir elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        // Verificar el número de elementos
        System.out.println("Número de elementos: " + lista.getNumElementos());  // Debería imprimir 5

        // Intentar agregar un elemento extra (el tamaño debería aumentarse automáticamente)
        lista.add(60);
        System.out.println("Número de elementos después de añadir 60: " + lista.getNumElementos());  // Debería imprimir 6

        // Verificar el estado de la lista tras añadir los elementos
        for (int i = 0; i < lista.getNumElementos(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + lista.array[i]);
        }

        // Usar un iterador para recorrer la lista
        Iterador<Integer> iterador = lista.getIterador();
        System.out.println("Recorriendo la lista con el iterador:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Eliminar un elemento de la lista
        lista.delete(30);
        System.out.println("Lista después de eliminar 30:");
        for (int i = 0; i < lista.getNumElementos(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + lista.array[i]);
        }

        // Probar la búsqueda de un elemento
        Object resultado = lista.buscar(40);
        System.out.println("Resultado de buscar el 40: " + resultado);  // Debería imprimir el índice del 40

        // Probar la reversión de la lista
        ListaBasica<Integer> listaReversa = lista.reverse();
        System.out.println("Lista reversa:");
        for (int i = 0; i < listaReversa.getNumElementos(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + listaReversa.array[i]);
        }

        // Probar la suma de listas
        ListaBasica<Integer> otraLista = new ListaBasica<>(5);
        otraLista.add(70);
        otraLista.add(80);
        lista.sumar(otraLista);
        System.out.println("Lista después de sumar otra lista:");
        for (int i = 0; i < lista.getNumElementos(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + lista.array[i]);
        }

        // Modificar un elemento en un índice específico
        lista.setElemento(3, 100);
        System.out.println("Lista después de modificar el elemento en la posición 3:");
        for (int i = 0; i < lista.getNumElementos(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + lista.array[i]);
        }
    }
}

