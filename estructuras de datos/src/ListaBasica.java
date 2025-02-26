public class ListaBasica<T> implements Lista<T> {

    T[] array;
    int numElementos;
    int maxElementos; //numElementos <= maxElementos SIEMPRE

    public ListaBasica(int maxElementos) {
        this.maxElementos = maxElementos;
        numElementos = 0;
        this.array = (T[]) new Object[numElementos];
    }
    @Override
    public int getNumElementos(){
        return numElementos;
    }
    @Override
    public boolean add(T elemento){ //añade el elemento al final de la lista
        array[numElementos] = elemento;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        T cabeza = array[0];
        for(int i = 1; cabeza != elemento; i++){
            cabeza = array[i];
            if (i == numElementos){
                System.out.println("El elemento no está en la lista");
                return false;
            }
            cabeza = null;
            for (int j = numElementos - 1; array[j] == null; j--){
                array[j-1] = array[j];
            }
            numElementos -= 1;
        }
        return true;
    }
    @Override
    public Iterador<T> getIterador() {
        return new IteradorListaBasica<T>();
    }

    public void aumentarT(){
        if(numElementos == maxElementos){
            maxElementos *= 2;
        }
    }
    public boolean estaVacia(){
        return numElementos == 0;
    }
}
