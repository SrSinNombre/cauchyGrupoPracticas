public class IteradorListaSE<T> implements Iterador<T>{
    Elemento<T> puntero;
    ListaSE<T> lista;
    Elemento<T> output; // almacena la salida de next()

    public IteradorListaSE(Elemento<T> cabeza){
        this.puntero = cabeza;
        this.output = null;
    }

    @Override
    public boolean hasNext(){
        return puntero.getSiguiente() != null;
    }
    @Override
    public T next(){
        if(!hasNext()) {
            System.out.println("No hay más elementos en la lista");
            return null;
        }else{
            output = puntero.getSiguiente(); //siguiente nodo
            puntero = puntero.getSiguiente(); //actualiza el puntero
            return output.getDato(); //devuelve el dato de output
        }
    }
    @Override
    public void delete(){ // elimina el último nodo retornado por next()
        if(output == null){
            System.out.println("No se ha invocado el método next() anteriormente");
        }else{
            Elemento<T> anterior = lista.getCabeza();
            while(anterior != null && anterior.getSiguiente() != output){
                anterior = anterior.getSiguiente();
            }
            if(anterior != null){ //en realidad sobra pero me garantiza que anterior sea no nulo
                Elemento<T> s = anterior.getSiguiente();
                s = output.getSiguiente(); //sustituye el elemento de después de output por el anterior
                output = null; //elimina el elemento en cuestión
            }
        }
    }
}
/*  EJEMPLO:
        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        algo de tipo ELemento<T> son las parejas 1 -> (cabeza), 2 ->, 3 ->..., donde el número es "dato" y la flecha "siguiente"
        supongamos que next() devuelve 3 (output es 3 ->, es decir, el tercer elemento)
        linea 31: anterior = 1->
        bucle while: va buscando el elemento 3 -> hasta que lo encuentra y sale del bucle (anterior = 3 ->)
         s = anterior.getSiguiente(), es decir, el elemento después del 3 ->, el 4 ->
         output.getSiguiente() es 4 -> ,es decir, donde había 3 -> ahora hay 4 ->
         la lista quedaría así:
         1 -> 2 -> 4 -> 4 -> 5 -> 6 -> null
         como el 4 -> está duplicado, elimina uno, en concreto el primero porque es el tercer elemento, el output
         la lista finalmente quedaría así:
         1 -> 2 -> 4 -> 5 -> 6 -> null
 */