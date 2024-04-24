package Tarea.clasedulces;

public class Calugas extends Dulces{
    public Calugas(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String(super.Consumir() + "caluga");
    }
}
