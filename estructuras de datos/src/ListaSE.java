public class ListaSE<T> implements Lista<T>{
    Elemento<T> cabeza;

    public ListaSE(){
        this.cabeza = null;
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
        Iterador<T> it = new IteradorListaSE<>();
        System.out.print(cabeza.getDato() + " -> ");
        while(it.hasNext()){
            System.out.print(it.next() + " -> ");
        }
    }
}
