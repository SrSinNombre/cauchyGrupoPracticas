public class IteradorListaSE<T> implements Iterador<T>{
    int indice;
    ListaSE<T> lista;

    public IteradorListaSE(){
        indice = 0;
    }

    @Override
    public boolean hasNext(){
        return indice < lista.getNumElementos();
    }
    @Override
    public T next(){
        Elemento<T> nodo = lista.cabeza;
        for(int i = 0; i != indice; i++){
            nodo = nodo.getSiguiente();
        }
        return nodo.getDato();
    }
    @Override
    public void delete(){
        Elemento<T> nodo = lista.cabeza;
        for(int i = indice; i <= lista.getNumElementos(); i++){
            Elemento<T> siguiente = nodo.getSiguiente();
            siguiente = nodo;
        }
        indice -= 1;
    }
}
