package Tarea;

class Comprador {
    private String sonido;
    private int vuelto = 0;

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queCompraste() {
        return sonido;
    }

    public Comprador(Moneda m, int cual, Expendedor exp) throws Exception {
        Producto beer = exp.comprarProducto(m, cual);
        if (beer != null) {
            sonido = beer.Consumir();

        }
        Moneda aux = exp.getVuelto();
        while (aux != null) {
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
}
