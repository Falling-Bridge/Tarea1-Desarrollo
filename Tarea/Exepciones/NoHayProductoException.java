package Tarea.Exepciones;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        System.err.println("En el deposito no quedan de ese tipo de producto.");
    }
}
