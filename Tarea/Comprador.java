package Tarea;

class Comprador {
    private String sonido;
    private int vuelto = 0;

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }

    public Comprador(Moneda m, int cual, Expendedor exp) {
        Bebida beer = exp.comprarBebida(m, cual);
        if (beer != null) {
            sonido = beer.beber();

        }
        Moneda aux = exp.getVuelto();
        while (aux != null) {
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
}