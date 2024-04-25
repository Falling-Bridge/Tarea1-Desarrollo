package Tarea.Dulcestipo;

public class Snickers extends Dulces{
    public Snickers(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String(super.Consumir() + "snickers");
    }
}