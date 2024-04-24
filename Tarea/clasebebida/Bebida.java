package Tarea.clasebebida;
import Tarea.Producto;

public abstract class Bebida extends Producto{
    public String Consumir(){
        return "Bebe una ";
    }

    public Bebida(int a) {
        super(a);
    }
}