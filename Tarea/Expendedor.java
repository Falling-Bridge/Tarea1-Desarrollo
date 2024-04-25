package Tarea;
import Tarea.Bebidatipo.*;
import Tarea.Dulcestipo.*;
class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulces> serranita;
    private Deposito<Dulces> snickers;
    private Deposito<Dulces> super8;
    private Deposito<Moneda> monVu;
    private int price;

    public Moneda getVuelto() {
        return monVu.getElemento();
    }

    public Producto comprarProducto(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != 1 && cual != 2 && cual != 3 && cual != 4 && cual != 5 && cual != 6)){
            monVu.addElemento(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addElemento(new Moneda100());
        }
        Bebida auxBebida = null;
        Dulces auxDulces = null;

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
                auxBebida = fanta.getElemento();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
                
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
                auxDulces = snickers.getElemento();
                if(auxDulces == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;
            
            case 6: 
                auxDulces = super8.getElemento();
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
        fanta = new Deposito<Bebida>();
        serranita = new Deposito<Dulces>();
        snickers = new Deposito<Dulces>();
        super8 = new Deposito<Dulces>();
        monVu = new Deposito<Moneda>();

        if (a > 0){
            for (int i = 0; i < a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida fan = new Fanta(i);
                Dulces ser = new Serranita(i);
                Dulces sni = new Snickers(i);
                Dulces sup = new Super8(i);
                coca.addElemento(coc);
                sprite.addElemento(spi);
                fanta.addElemento(fan);
                serranita.addElemento(ser);
                snickers.addElemento(sni);
                super8.addElemento(sup);
            }
        }
        
        price = b;
    }
}
