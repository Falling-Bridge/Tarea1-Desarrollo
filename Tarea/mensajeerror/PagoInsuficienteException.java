package Tarea.mensajeerror;

public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(){
        super("Has pasado insuficiente dinero para comprar el producto indicado");
    }
}