package Tarea.mensajeserror;

public class NoHayProductoException extends Exception {
    
    public NoHayProductoException() {
        super("No hay producto disponible");
    }
    
    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}
