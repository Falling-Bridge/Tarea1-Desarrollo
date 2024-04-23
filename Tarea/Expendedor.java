package Tarea;
import Tarea.clasemoneda.*;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> pepsi;
    private Deposito<Dulces> serranita;
    private Deposito<Dulces> calugas;
    private Deposito<Dulces> oreos;
    private DepositoM monVu;
    private int price;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int PEPSI = 3;
    public static final int SERRANITA = 4;
    public static final int CALUGAS = 5;
    public static final int OREOS = 6;

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != COCA && cual != SPRITE && cual != PEPSI)){
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
            case PEPSI: 
                auxBebida = pepsi.getBebida();
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

    public Dulces comprarDulces(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != SERRANITA && cual != CALUGAS && cual != OREOS)){
            monVu.addMoneda(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addMoneda(new Moneda100());
        }
        Dulces auxDulces = null;
        switch (cual) {
            case SERRANITA: 
                auxDulces = serranita.getDulces();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxDulces;

            case CALUGAS: 
                auxDulces = calugas.getDulces();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxDulces;
            
            case OREOS: 
                auxDulces = oreos.getDulces();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxDulces;
            
            default: return null;    
        }
    }

    public Expendedor(int a, int b) {
        coca = new Deposito();
        sprite = new Deposito();
        pepsi = new Deposito();
        serranita = new Deposito();
        calugas = new Deposito();
        oreos = new Deposito();
        monVu = new DepositoM();

        if (a > 0){
            for (int i = 0; i < a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida pep = new Pepsi(i);
                Dulces ser = new Serranita(i);
                Dulces cal = new Calugas(i);
                Dulces ore = new Oreos(i);
                coca.addBebida(coc);
                sprite.addBebida(spi);
                pepsi.addBebida(pep);
                serranita.addDulces(ser);
                calugas.addDulces(cal);
                oreos.addDulces(ore);
            }
        }
        price = b;
    }
}