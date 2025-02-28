public class ElementoDoble<T> {
    private T dato;
    private Elemento<T> anterior;
    private Elemento<T> siguiente;

    public ElementoDoble(T dato){
        this.dato = dato;
        anterior = null;
        siguiente = null;
    }
    public T getDato(){
        return dato;
    }
    public Elemento<T> getSiguiente(){
        return siguiente;
    }
    public Elemento<T> getAnterior(){
        return anterior;
    }

}
