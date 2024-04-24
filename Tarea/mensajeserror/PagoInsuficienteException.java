package Tarea.mensajeserror;

public class PagoInsuficienteException extends Exception {
    
    public PagoInsuficienteException() {
        super("No haz ingresado suficiente dinero para comprar");
    }
    
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}