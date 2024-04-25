package Tarea.clasebebida;

public class Fanta extends Bebida {
    public Fanta(int ap) {
        super(ap);
    }

    public String Consumir() {
        return (super.Consumir() + "pepsi");
    }
}