public class IteradorDiccionario<K, V> implements Iterador<K> {
    private ListaDE<Diccionario<K, V>> elementos;
    private ElementoDoble<Diccionario<K, V>> posicion;
    private ElementoDoble<Diccionario<K, V>> output = null;

    public IteradorDiccionario(ListaDE<Diccionario<K, V>> elementos) {
        this.elementos = elementos;
        posicion = elementos.getCabeza();
    }

    @Override
    public boolean hasNext() {
        return posicion.getSiguiente() != null;
    }

    @Override
    public K next() {
        if (!hasNext()) {
            System.out.println("No hay elementos en la lista");
            return null;
        }
        output = posicion.getSiguiente();
        return output.getDato().getClave();
    }

    @Override
    public void delete() {
        if(output == null){
            System.out.println("No se ha invocado el método next()");
        }else{
            ElementoDoble<Diccionario<K, V>> posicion2 = posicion;
            ElementoDoble<Diccionario<K, V>> anterior = posicion.getAnterior();
            anterior = null;
            while(posicion2.getSiguiente() != null){
                posicion2 = posicion2.getSiguiente();
            }
        }
    }
}
