package Tarea;
import java.util.ArrayList;

class Deposito<T> {//clase que permite la creación de depositos de manera generica para bebidas dulces y monedas

    private ArrayList<T> lista;//implementación de ArrayList para almacenar los elementos
/**
 * agrega el elemnto dado al ArrayList
 * @author Pablo Villagrán-Lucas Morales
 * @param elemento puede ser de tipo Producto o moneda y se usa las funciones de ArrayList para agregarlo a lista
 */
    public void addElemento(T elemento){
        lista.add(elemento);
    }
/**
 * se usa una variabe aux para entregar el elemento
 * @author Pablo Villagrán-Lucas Morales
 * @return retorna el primer elemento del arreglo, primero verifica que no este vacio y si no lo está, lo saca y lo retorna
 */
    public T getElemento() {
        if (lista.size() != 0) {
            T aux = lista.get(0);
            lista.remove(0);
            return aux;
        }
        else return null;//en caso de q este vacio retorna un null
    }

    public Deposito() {//constructor de la clase, incializa el ArrayList
        lista = new ArrayList<>();
    }
}