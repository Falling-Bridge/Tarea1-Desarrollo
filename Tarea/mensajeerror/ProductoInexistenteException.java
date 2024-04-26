package Tarea.mensajeerror;
/**
 * excepción que imprime un mensaje de error cuando se intenta comprar un producto que no este definido en la clase de 
 * Variablesestaticas o cuando se intenta comprar con un tipo null 
 * @author Pablo Villagrán
 */
public class ProductoInexistenteException extends Exception{
    public ProductoInexistenteException(){
        super("El producto solicitado no está en los expendedores o es null");
    }   
}