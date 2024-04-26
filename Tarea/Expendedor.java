package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulces> serranita;
    private Deposito<Dulces> snickers;
    private Deposito<Dulces> super8;
    private Deposito<Moneda> monVu;

    public Moneda getVuelto() throws Exception{
        return monVu.getElemento();
    }

    public Producto comprarProducto(Moneda m, Valoresestaticos producto) throws Exception{
        if(m == null){
            throw new PagoIncorrectoException();
        }

        if( m.getValor() < producto.getCoste()){
            monVu.addElemento(m);
            throw new PagoInsuficienteException();
        }
        
        for(int i = producto.getCoste(); i<m.getValor(); i+=100){
            monVu.addElemento(new Moneda100());
        }

        switch (producto) {
            case COCA: 
                if (coca.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return coca.getElemento();

            case SPRITE: 
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return sprite.getElemento();
            case FANTA: 
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return fanta.getElemento();
                
            case SERRANITA: 
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return serranita.getElemento();

            case SNICKERS: 
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return snickers.getElemento();
            
            case SUPER8: 
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return super8.getElemento();
            
            default: return null;    
        }
    }

    public Expendedor(int a) {
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        fanta = new Deposito<Bebida>();
        serranita = new Deposito<Dulces>();
        snickers = new Deposito<Dulces>();
        super8 = new Deposito<Dulces>();
        monVu = new Deposito<Moneda>();

        if (a > 0){
            for (int i = 0; i <= a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida fan = new Fanta(i);
                Dulces ser = new Serranita(i);
                Dulces cal = new Snickers(i);
                Dulces sup = new Super8(i);
                coca.addElemento(coc);
                sprite.addElemento(spi);
                fanta.addElemento(fan);
                serranita.addElemento(ser);
                snickers.addElemento(cal);
                super8.addElemento(sup);
            }
        }
    }
}