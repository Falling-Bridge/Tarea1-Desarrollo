package Tarea.clasedulces;

public class Calugas extends Dulces{
    public Calugas(int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "caluga");
    }
}
