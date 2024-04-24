package Tarea.mensajeserror;

public class PagoIncorrectoException extends Exception {
    
    public PagoIncorrectoException() {
        super("No Haz ingresado una moneda válida");
    }
    
    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}