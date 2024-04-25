package Tarea.Dulcestipo;
import Tarea.Producto;
public abstract class Dulces extends Producto {
    public Dulces(int p){
        super(p);
    }
    public String Consumir(){
        return "se comio un ";
    }
}


