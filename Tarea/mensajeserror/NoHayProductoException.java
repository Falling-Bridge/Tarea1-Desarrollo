package Tarea.mensajeserror;

public class NoHayProductoException extends Exception {
    
    public NoHayProductoException() {
        super("No Queda del prodcuto seleccionado");
    }
    
    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}
