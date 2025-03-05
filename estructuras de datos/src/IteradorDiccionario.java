import java.util.LinkedList;

public class IteradorDiccionario implements Iterador {
    private LinkedList<Diccionario> elementos;
    private int posicion;

    public IteradorDiccionario(LinkedList<Diccionario> elementos) {
        this.elementos = elementos;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < elementos.size();
    }

    @Override
    public Diccionario next() {
        if (!hasNext()) {
            throw new IllegalStateException("No hay elementos en la lista");
        }
        return elementos.get(posicion++);
    }

    @Override
    public void delete() {

    }

    @Override
    public void remove() {
        if (posicion == 0) throw new IllegalStateException("No se puede eliminar antes de llamar a next()");
        elementos.remove(--posicion);
    }
}
