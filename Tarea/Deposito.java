package Tarea;
import java.util.ArrayList;

class Deposito {

    private ArrayList<Bebida> lista1;

    public void addBebida(Bebida vodka) {
        lista1.add(vodka);
    }

    public Bebida getBebida() {
        if (lista1.size() == 0) {
            return null;
        } else {
            Bebida aux = lista1.get(0);
            lista1.remove(0);
            return aux;
        }
    }

    public Deposito() {
        lista1 = new ArrayList<Bebida>();
    }
}
