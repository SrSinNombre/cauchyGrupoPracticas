public class ListaBasica<T> {

    private T[] array;
    private int T_Max;

    public ListaBasica(int capacidad) {
        this.T_Max = capacidad;
        this.array = (T[]) new Object[T_Max];
    }


    public void setElemento(int indice, T e) {
        if (indice >= 0 && indice < T_Max) {
            array[indice] = e;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public T getElemento(int indice) {
        if (indice >= 0 && indice < T_Max) {
            return array[indice];
        }
        return null;
    }

    public void mostrarElementos() {
        for (T e : array) {
            if (e != null) {
                System.out.println(e.toString());
            }
        }
    }
}
