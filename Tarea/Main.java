package Tarea;
import Tarea.clasemoneda.*;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 1000);
        Moneda m = null;
        Comprador c = null;

        m = new Moneda1500();
        c = new Comprador(m, 3, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, 1, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m, 662, exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
    }
}