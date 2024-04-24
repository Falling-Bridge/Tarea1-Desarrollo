package Tarea.clasebebida;

public class CocaCola extends Bebida {
    public CocaCola(int ac) {
        super(ac);
    }

    public String Consumir() {
        return (super.Consumir() + "cocacola");
    }
}