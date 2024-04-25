package Tarea.mensajeerror;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("Has pasado una moneda sin valor");
    }
}