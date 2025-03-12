public class DiccionarioBasico<K, V> {
    public ListaDE<Diccionario<K, V>> lista;

    public DiccionarioBasico() {
        lista = new ListaDE<>();
    }

    public void agregar(K clave, V valor) {
        lista.add(new Diccionario<>(clave, valor));
    }

    public V obtener(K clave) {
        for (Diccionario<K, V> elemento : lista) {
            if (elemento.getClave() == clave) {
                return elemento.getValor();
            }
        }
        return null;
    }
}