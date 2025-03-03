public class ListaSE<T> implements Lista<T>{
    private Elemento<T> cabeza;

    public ListaSE(){
        this.cabeza = null;
    }
    public ListaSE(Elemento<T> cabeza){
        this.cabeza = cabeza;
    }
    public Elemento<T> getCabeza(){
        return cabeza;
    }
    @Override
    public boolean add(T elemento){
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        while(cabeza != null){
            cabeza = cabeza.getSiguiente();
        }
        cabeza = nuevoElemento;
        return true;
    }
    @Override
    public boolean delete(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if(estaVacia()){
            System.out.println("la lista está vacía.");
            return false;
        }
        else{
            Elemento<T> actual = cabeza;
            while(actual.getSiguiente() != nuevoElemento){
                actual = actual.getSiguiente();
            }
            Elemento<T> siguiente = actual.getSiguiente();
            while(siguiente.getSiguiente() != null){
                siguiente = siguiente.getSiguiente();
            }
            return true;
        }
    }
    @Override
    public int getNumElementos(){
        int contador = 0;
        while(cabeza != null){
            contador += 1;
            cabeza = cabeza.getSiguiente();
        }
        return contador;
    }
    @Override
    public Iterador<T> getIterador(){
        return new IteradorListaSE<>(cabeza);
    }

    public void imprimir(){
        while(getIterador().hasNext()){
            System.out.print(getIterador().next() + " -> ");
        }
    }
    public boolean estaVacia(){
        return cabeza == null;
    }
}
