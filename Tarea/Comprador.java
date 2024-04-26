package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

class Comprador {
    private String sonido;
    private int vuelto = 0;

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queConsumiste() {
        return sonido;
    }

    public Comprador(Moneda m, Valoresestaticos producto, Expendedor exp)throws Exception {
        Producto beer = exp.comprarProducto(m, producto);
        
        if (beer != null) {
            sonido = beer.Consumir();
        } else {
            System.out.println(exp.getVuelto().getValor());
            throw new NoHayProductoException();
        }
        Moneda aux = exp.getVuelto();
        while (aux != null) {
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
}