package Tarea.clasedulces;
import Tarea.Producto;

public abstract class Dulces extends Producto {
    public String Consumir(){
        return "Come una ";
    }

    public Dulces(int a) {
        super(a);
    }
}