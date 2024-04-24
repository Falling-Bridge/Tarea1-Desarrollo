package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(3, 500);
        Moneda m = null;
        Comprador c = null;
        m = new Moneda1500();
        c = new Comprador(m, 3, exp);

        try {
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            // Imprimir el mensaje de la excepción
            System.err.println("Error: " + e.getMessage());
        }
    }
}