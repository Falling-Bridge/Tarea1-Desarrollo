package Tarea.clasedulces;

public class Serranita extends Dulces{

    public Serranita(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String(super.Consumir() + "serranita");
    }
}