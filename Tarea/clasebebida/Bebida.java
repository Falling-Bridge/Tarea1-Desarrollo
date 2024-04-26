package Tarea.clasebebida;
import Tarea.Producto;
/**
 * Esta clase es un molde para los distintos tipos de bebidas que hay, y hereda a producto y sus metodos
 */
public abstract class Bebida extends Producto{
/**
 * es una función que imprime una parte de un mensaje, que se completa el las subclases
 * @author Lucas Morales 
 */
    public String Consumir(){
        return "Bebe una ";
    }
/**
 * llama al constructor de la clase producto, que es donde se le da el valor a la serie del objeto
 * @author Pablo Villagrán-Lucas Morales
 * @param a es la serie que va a tener la bebida, no es utilizado pero entrega un orden y personalización a cada instacia de la clase
 */
    public Bebida(int a) {
        super(a);
    }
}