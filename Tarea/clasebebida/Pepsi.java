package Tarea.clasebebida;

public class Pepsi extends Bebida {
    public Pepsi(int ap) {
        super(ap);
    }

    public String dulces() {
        return new String(super.Consumir() + "pepsi");
    }
}