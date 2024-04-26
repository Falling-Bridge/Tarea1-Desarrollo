package Tarea.mensajeerror;

public class PagoInsuficienteException extends Exception{
    /**
     * excepción que imprime un mensaje de error cuando se intenta comprar un producto con una moneda de menor valor al valor del producto 
     * @author Pablo Villagrán-Lucas Morales
     */
    public PagoInsuficienteException(){
        super("No has pasado suficiente dinero para comprar el producto indicado");
    }
}