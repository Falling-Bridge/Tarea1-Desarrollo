package Tarea.mensajeerror;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("No queda del producto que quieres comprar");
    }
}