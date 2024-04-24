package Tarea.clasebebida;

public class Pepsi extends Bebida {
    public Pepsi(int ap) {
        super(ap);
    }

    public String Consumir() {
        return (super.Consumir() + "pepsi");
    }
}