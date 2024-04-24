package Tarea.clasebebida;

public class Sprite extends Bebida {
    public Sprite(int ab) {
        super(ab);
    }

    public String dulces() {
        return new String(super.Consumir() + "sprite");
    }
}