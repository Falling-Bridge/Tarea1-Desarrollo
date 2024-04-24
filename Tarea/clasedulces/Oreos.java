package Tarea.clasedulces;

public class Oreos extends Dulces{

    public Oreos(int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "oreo");
    }
}