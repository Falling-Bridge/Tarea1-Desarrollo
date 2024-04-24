package Tarea.mensajeserror;

public class PagoIncorrectoException extends Exception {
    
    public PagoIncorrectoException() {
        super("No hay producto disponible");
    }
    
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}