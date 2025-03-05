public class IteradorListaDE<T> implements Iterador<T>{
    ElementoDoble<T> puntero;
    ElementoDoble<T> output;

    public IteradorListaDE(ElementoDoble<T> cabeza){
        this.puntero = cabeza;
        output = null;
    }
    @Override
    public boolean hasNext() {
        return puntero != null;
    }
    @Override
    public T next(){
        if(!hasNext()){
            System.out.println("No hay siguiente elemento");
            return null;
        }
        else{
            output = puntero.getSiguiente();
            puntero = puntero.getSiguiente();
            return output.getDato();
        }
    }
    @Override
    public void delete(){
        if(output == null){
            System.out.println("No se ha invocado el método next()");
        }else{
            ElementoDoble<T> puntero2 = puntero;
            ElementoDoble<T> anterior = puntero.getAnterior();
            anterior = null;
            while(puntero2.getSiguiente() != null){
                puntero2 = puntero2.getSiguiente();
            }
        }
    }

    @Override
    public void remove() {

    }
}
