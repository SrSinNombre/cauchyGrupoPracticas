public class IteradorListaBasica<T> implements Iterador<T> {
    T[] array;
    int numElementos;
    int contador;

    public IteradorListaBasica(){
        this.contador = 0;
    }
    @Override
    public boolean hasNext(){
        return contador < numElementos;
    }
    @Override
    public T next() {
        T siguiente = array[contador+1];
        contador += 1;
        return siguiente;
    }
    @Override
    public void delete(){
        for(int i = contador; i < numElementos - 1; i--) {
            array[i] = array[i+1];
        }
        numElementos -= 1;
        contador -= 1;
    }
}