package Tarea.Bebidatipo;

public class Fanta extends Bebida {
    public Fanta(int ap) {
        super(ap);
    }

    public String dulces() {
        return new String(super.Consumir() + "fanta");
    }
}
