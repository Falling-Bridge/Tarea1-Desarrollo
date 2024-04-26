package Tarea.mensajeerror;
/**
 * excepción que imprime un mensaje de error cuando se intenta comprar un producto con una moneda no inicializada o con una de tipo null
 * @author Pablo Villagrán-Lucas Morales
 */
public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("Has pasado una moneda sin valor");
    }
}