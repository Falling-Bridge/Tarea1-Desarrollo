package Tarea;

public abstract class Producto {

    private int serie;

    public int getSerie() { 
        return serie;
    }

    public abstract String Consumir();

    public Producto(int a){
        serie = a;
    }
}
