package Tarea;

public abstract class Producto {//calse que generaliza bebidas y dulce, pemitiendo manejar mejor los returns de los metodos de expendedor

    private int serie;//valor que es propio de cada instancia

    public int getSerie() { //un getter para obtener la serie de la instancia de producto o sus herederos
        return serie;
    }

    public abstract String Consumir();//metodo abstracto que se persolaiza en las subs clases y las subsubclases 
/**
 * el constructor de la clase, que setea la serie del producto al momento de crearla
 * @author Lucas Morales
 * @param a es el entero que se pasa como serie del producto
 */
    public Producto(int a){
        serie = a;
    }
}
