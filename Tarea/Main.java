package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeserror.*;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1, 1000);
        Moneda m = null;
        Comprador c = null;

        m = new Moneda1500();
        c = new Comprador(m, 1, exp);
        try{
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        }
        catch (NoHayProductoException){

        }
        catch(PagoIncorrectoException){

        }
        catch(PagoInsuficienteException){

        }


        m = new Moneda1500();
        c = new Comprador(m, 1, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m, 662, exp);
    }
}