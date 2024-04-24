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
    private Deposito<Moneda> monVu;
    private int price;

    public Moneda getVuelto() {
        return monVu.getElemento();
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != 1 && cual != 2 && cual != 3)){
            monVu.addElemento(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addElemento(new Moneda100());
        }
        Bebida auxBebida = null;
        switch (cual) {
            case 1: 
                auxBebida = coca.getElemento();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
            case 2: 
                auxBebida = sprite.getElemento();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
            case 3: 
                auxBebida = pepsi.getElemento();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
            
            default: return null;    
        }
    }

    public Dulces comprarDulces(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != 4 && cual != 5 && cual != 6)){
            monVu.addElemento(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addElemento(new Moneda100());
        }
        Dulces auxDulces = null;
        switch (cual) {
            case 4: 
                auxDulces = serranita.getElemento();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;

            case 5: 
                auxDulces = calugas.getElemento();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;
            
            case 6: 
                auxDulces = oreos.getElemento();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;
            
            default: return null;    
        }
    }

    public Expendedor(int a, int b) {
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        pepsi = new Deposito<Bebida>();
        serranita = new Deposito<Dulces>();
        calugas = new Deposito<Dulces>();
        oreos = new Deposito<Dulces>();
        monVu = new Deposito<Moneda>();

        if (a > 0){
            for (int i = 0; i < a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida pep = new Pepsi(i);
                Dulces ser = new Serranita(i);
                Dulces cal = new Calugas(i);
                Dulces ore = new Oreos(i);
                coca.addElemento(coc);
                sprite.addElemento(spi);
                pepsi.addElemento(pep);
                serranita.addElemento(ser);
                calugas.addElemento(cal);
                oreos.addElemento(ore);
            }
        }
        price = b;
    }
}