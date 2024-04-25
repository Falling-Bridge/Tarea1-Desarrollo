package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;
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
        Bebida auxBebida = null;
        Dulces auxDulces = null;

        switch (producto) {
            case COCA: 
                if (coca.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.addElemento(m);
                    }
                    monVu.addElemento(m);
                    throw new NoHayProductoException();
                }
                return coca.getElemento();

            case SPRITE: 
                auxBebida = sprite.getElemento();
                if(auxBebida == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
            case PEPSI: 
                auxBebida = pepsi.getElemento();
                if(auxBebida == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;
                
            case SERRANITA: 
                auxDulces = serranita.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;

            case CALUGAS: 
                auxDulces = calugas.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;
            
            case OREOS: 
                auxDulces = oreos.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;
            
            default: return null;    
        }
    }

    public Expendedor(int a) {
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
    }
}