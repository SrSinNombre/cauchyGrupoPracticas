public class ListaSE<T> implements Lista<T>{
    private Elemento<T> cabeza;

    public ListaSE(){
        this.cabeza = getCabeza();
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
        if(cabeza == null){
            System.out.println("la lista está vacía.");
            return false;
        }
        else{
            Elemento<T> actual = cabeza;
            while(actual != nuevoElemento){
                actual = actual.getSiguiente();
            }
            while(actual != null){
                actual = actual.getSiguiente();
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
        return new IteradorListaSE<>();
    }

    public void imprimir(){
        while(getIterador().hasNext()){
            System.out.print(getIterador().next() + " -> ");
        }
    }
}
