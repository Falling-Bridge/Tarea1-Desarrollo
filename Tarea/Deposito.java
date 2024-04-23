package Tarea;
import java.util.ArrayList;

class Deposito {

    private ArrayList<Bebida> listabebidas;
    private ArrayList<Dulces> listadulces;

    public void addBebida(Bebida drinks) {
        listabebidas.add(drinks);
    }

    public Bebida getBebida() {
        if (listabebidas.size() == 0) {
            return null;
        } else {
            Bebida aux1 = listabebidas.get(0);
            listabebidas.remove(0);
            return aux1;
        }
    }

    public void addDulces(Dulces candy) {
        listadulces.add(candy);
    }

    public Dulces getDulces() {
        if (listadulces.size() == 0) {
            return null;
        } else {

            Dulces aux2 = listadulces.get(0);
            listadulces.remove(0);
            return aux2;
        }
    }

    public Deposito() {
        listabebidas = new ArrayList<Bebida>();
        listadulces = new ArrayList<Dulces>();
    }
}
