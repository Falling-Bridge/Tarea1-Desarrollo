package Tarea.clasebebida;

public class Sprite extends Bebida {
    public Sprite(int ab) {
        super(ab);
    }

    public String Consumir() {
        return (super.Consumir() + "sprite");
    }
}