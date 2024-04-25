package Tarea;

import Tarea.Excepciones.NoHayProductoException;
import Tarea.Excepciones.PagoIncorrectoException;
import Tarea.Excepciones.PagoInsuficienteException;
import Tarea.Excepciones.ProductoInexistente;

public class Main {
    public static void main(String[] args) throws Exception{
        Expendedor exp = new Expendedor(1,1000);
        Moneda100 m = null;
        Comprador c=null;

        m = new Moneda100();
        try{
            c = new Comprador(m,1,exp);
        }
        catch(NoHayProductoException e){
            System.out.println(e.getMessage());
        }
        catch(PagoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        catch(PagoIncorrectoException e){
            System.out.println(e.getMessage());
        }
        catch(ProductoInexistente e){
            System.out.println(e.getMessage());
        }
        finally{
        System.out.println(c.queCompraste() + ", " + c.cuantoVuelto());
        }
        m = new Moneda100();
        c = new Comprador(m,1,exp);
        System.out.println(c.queCompraste() + ", " + c.cuantoVuelto());
    }
}