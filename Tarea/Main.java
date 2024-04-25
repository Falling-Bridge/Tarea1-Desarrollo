package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Expendedor exp = new Expendedor(0);
        Moneda m = null;
        Comprador c = null;
        Valoresestaticos v = null;
        v = Valoresestaticos.SPRITE;
        m = new Moneda1500();
        try{
            c = new Comprador(m, v, exp);
            System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        }catch(NoHayProductoException | PagoIncorrectoException e){
            System.out.println(e.getMessage());  
        }
        
    }
}