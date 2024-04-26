package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int cantidad = 0;
        Expendedor exp = new Expendedor(cantidad);
        Moneda m = new Moneda100();
        Comprador c = null;
        Valoresestaticos v = null;
        v = Valoresestaticos.COCA;
        for (int i = 0; i <= cantidad; i++){
            try{
                c = new Comprador(m, v, exp);
                System.out.println(c.queConsumiste() + "\n" + c.cuantoVuelto());
            }catch(NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException e){
                System.out.println(e.getMessage());  
            }
        }
    }
}