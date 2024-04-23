package Tarea.clasemoneda;

public abstract class Moneda {
    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public Moneda() {
    }
}