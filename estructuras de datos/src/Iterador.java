public interface Iterador<T> {
    boolean hasNext();
    T next(T elemento);
    void delete();
}
