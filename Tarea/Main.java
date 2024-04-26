package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Expendedor exp = new Expendedor(4);//se crea un expendedor y se llena con 4 bebidas y dulces de cada tipo
        Moneda m = null;//se crea una instancia de moneda, y luego se le da un valor instanciandola en una de las subclases de Moneda
        Comprador c = null;//se crea el comprador, y luego se instancia correctamente(principalmente por mantener un orden)
        Valoresestaticos v = null;//se crea una instancia de Valoresestaticos, para despues elegir q producto comprar
        v = Valoresestaticos.COCA;//se define el producto que se quiere comprar
        m = new Moneda100();//se le da el valor a la moneda
        try{
            c = new Comprador(m, v, exp);//se define el comprador usando las instancias de las otras clases
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());//se imprimen los resultados si no se toma con ninguna excepción
        }catch(NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException | ProductoInexistenteException e){
            System.out.println(e.getMessage());//en caso de encontrar alguna excepción llama a la clase Execption para q imprima el mensaje que nosotros definimos en cada clase
        }
        
    }
}