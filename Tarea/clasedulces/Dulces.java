package Tarea.clasedulces;

public abstract class Dulces {
    private int serie;

    public int getSerie() { 
        return serie;
    }

    public abstract String dulces();

    public Dulces(int a) {
        serie = a;
    }
}