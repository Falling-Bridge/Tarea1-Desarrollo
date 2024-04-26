package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

class Comprador {
    private String sonido;
    private int vuelto = 0;

    public int cuantoVuelto() {
        return vuelto;//funcion para devolver el vuelto al usuario
    }
/**
 * @author Lucas Morales
 * @return un string que se imprime en el main con el producto que se come/toma
 */
    public String queConsumiste() {
        return sonido;
    }
/**
 * @author Pablo Villagrán-Lucas Morales 
 * @param m es la moneda q se usa para pagar, se inicializa en el main y se calcula el vuelto que se debe entregar, y se ingresa al deposito
 * @param producto es el tipo de preducto que se usa que viene con el precio definido desde la clase Valoresestaticos
 * @param exp el expendedor del cual se compra la bebida/dulce, revisa que la moneda sea valida y que tenga el valor suficiente
 * @throws Exception manda una excepción en caso de que el deposito esté vacio
 */
    public Comprador(Moneda m, Valoresestaticos producto, Expendedor exp)throws Exception {
        Producto beer = exp.comprarProducto(m, producto);//se llama a la funcion comprarProducto que devuelve un producto o devuelve null si estaba vacio el deposito de dicho producto 
        
        if (beer != null) {
            sonido = beer.Consumir();//si no es null le asigna un valor a sonido con lo que llega desde el producto
        } else {
            throw new NoHayProductoException();//si es null manda la excepción de que no hay dicho producto en los depositos de este expendedor
        }
        Moneda aux = exp.getVuelto();//obtiene una moneda y mientras sigan habiendo monedas en el deposito de vuelto
        while (aux != null) {        //va sumandole 100 al valor del vuelto para luego retornarlo cuando lo soliciten
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
}