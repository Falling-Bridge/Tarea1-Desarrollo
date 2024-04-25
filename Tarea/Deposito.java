package Tarea;
import java.util.ArrayList;

class Deposito<T> {

    private ArrayList<T> lista;

    public void addElemento(T elemento){
        lista.add(elemento);
    }

    public T getElemento() {
        if (lista.size() == 0) {
        } else {
            T aux = lista.get(0);
            lista.remove(0);
            return aux;
        }
        return null;
    }

    public Deposito() {
        lista = new ArrayList<>();
    }
}