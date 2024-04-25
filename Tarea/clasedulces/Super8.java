package Tarea.clasedulces;

public class Super8 extends Dulces{

    public Super8 (int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "oreo");
    }
}