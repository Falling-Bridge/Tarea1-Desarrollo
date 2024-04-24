package Tarea.clasedulces;

public class Serranita extends Dulces{

    public Serranita(int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "serranita");
    }
}