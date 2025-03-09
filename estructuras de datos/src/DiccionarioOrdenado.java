import java.util.Collections;

public class DiccionarioOrdenado<K extends Comparable<K>, V> extends DiccionarioBasico<K, V> {
    @Override
    public void agregar(K clave, V valor) {
        super.agregar(clave, valor);
        Collections.sort(lista, (e1, e2) -> e1.getClass().componentType().getModifiers());
    }
}