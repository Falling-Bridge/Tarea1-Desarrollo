package Tarea.Dulcestipo;

public class Super8 extends Dulces{
    public Super8(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String(super.Consumir() + "super8");
    }
}
