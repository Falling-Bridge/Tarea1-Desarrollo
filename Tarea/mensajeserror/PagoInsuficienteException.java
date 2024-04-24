package Tarea.mensajeserror;

public class PagoInsuficienteException extends Exception {
    
    public PagoInsuficienteException() {
        super("No hay producto disponible");
    }
    
    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}