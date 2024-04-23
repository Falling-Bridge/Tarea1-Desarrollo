package Tarea;

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int price;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != COCA && cual != SPRITE)){
            monVu.addMoneda(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addMoneda(new Moneda100());
        }
        Bebida auxBebida = null;
        switch (cual) {
            case COCA: 
                auxBebida = coca.getBebida();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxBebida;
            case SPRITE: 
                auxBebida = sprite.getBebida();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxBebida;
            default: return null;
        }
    }

    public Expendedor(int a, int b) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();

        if (a > 0){
            for (int i = 0; i < a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                coca.addBebida(coc);
                sprite.addBebida(spi);
            }
        }

        price = b;
    }
}
