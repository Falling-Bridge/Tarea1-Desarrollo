package Tarea.clasebebida;

public abstract class Bebida {
    private int serie;

    public int getSerie() { 
        return serie;
    }

    public abstract String beber();

    public Bebida(int a) {
        serie = a;
    }
}