package Tarea;
import java.util.ArrayList;

class DepositoM {

    private ArrayList<Moneda> lista2;

    public void addMoneda(Moneda rublo) {
        lista2.add(rublo);
    }

    public Moneda getMoneda() {
        if (lista2.size() == 0) {
            return null;
        } else {
            Moneda aux = lista2.get(0);
            lista2.remove(0);
            return aux;
        }
    }

    public DepositoM() {
        lista2 = new ArrayList<Moneda>();
    }
}