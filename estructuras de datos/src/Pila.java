public class Pila<T> {
    private ListaSE<T> lista;

    public Pila() {
        this.lista = new ListaSE<>();
    }

    public void push(T elemento) {
        lista.agregarAlInicio(elemento);
    }

    public T pop() {
        if (lista.estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return lista.quitarDelInicio();
    }
    public boolean estaVacia() {
        return lista.estaVacia();
    }
}