package Tarea.mensajeerror;
/**
 * excepción que imprime un mensaje de error cuando se intenta comprar un producto que no hay en los dispensadores,
 *  debido a q ya se rertiraron todos los se habian ingresado antes
 * @author Pablo Villagrán-Lucas Morales
 */
public class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("No queda del producto que quieres comprar");
    }
}