package Tarea.clasedulces;

public class Snickers extends Dulces{
    public Snickers(int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "snicker");
    }
}
