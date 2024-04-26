package Tarea;
import Tarea.clasemoneda.*;
import Tarea.mensajeerror.*;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;

class Expendedor {
    private Deposito<Bebida> coca;//Depositos de Bebida sabor cocacola
    private Deposito<Bebida> sprite;//Depositos de Bebida sabor sprite
    private Deposito<Bebida> fanta;//Depositos de Bebida sabor fanta
    private Deposito<Dulces> serranita;//Depositos de Dulces tipo serranita
    private Deposito<Dulces> snickers;//Depositos de Dulces tipo snickers
    private Deposito<Dulces> super8;//Depositos de Dulces tipo super8
    private Deposito<Moneda> monVu;//Depositos de Monedas para el vuelto

    public Moneda getVuelto() throws Exception{
        return monVu.getElemento();//retorna las monedas q se encuentran en el deposito de monedas
    }
/**
 * @author Pablo Villagrán-Lucas Morales
 * @param m es la moneda con la q se paga, puede ser null, menor, mayor o igual al precio, y en los dos primeros manda una excepción
 * @param producto es el tipo de producto se pide, viene con el precio de este y se instancia en el main
 * @return un elemento de los depositos dependiendo de lo q se solicite, ya sea dulce o bebida
 * @throws Exception manda la excepción de PagoIncorectoException si se usa una moneda no instanciada o de tipo null
 */
    public Producto comprarProducto(Moneda m, Valoresestaticos producto) throws Exception{
        if(m == null){//si la moneda no tiene valor o no está definida manda una excepcion del tipo PagoIncorrectoException
            throw new PagoIncorrectoException();
        }
        if(producto == null){//manda la excepción si se intenta comprar un elemento null o algo no definido en Valoresestaticos 
            throw new ProductoInexistenteException();
        }
        else if( m.getValor() < producto.getCoste()){//si el valor de la moneda el menor al precio del producto manda un excepción del tipo
            monVu.addElemento(m);               //PagoInsuficienteException
            throw new PagoInsuficienteException();  
        }
        
        for(int i = producto.getCoste(); i<m.getValor(); i+=100){//agrega monedas hasta que la cantidad sea igual a la diferencia entre el 
            monVu.addElemento(new Moneda100());                  //precio del producto y el valor de la moneda dada   
        }
        Bebida auxBebida = null;
        Dulces auxDulces = null;

        switch (producto) {//segun el tipo de producto q se escogio entra a los distintos switch
            case COCA: //retorna una bebida de tipo cocacola si no manda excepción
                if (coca.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este
                    }
                    monVu.addElemento(m);
                }
                return coca.getElemento();//retorna el producto

            case SPRITE: //retorna una bebida de tipo sprite si no manda excepción
                if (sprite.getElemento() == null){
                    for (int i = producto.getCoste(); i < m.getValor(); i += 100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este
                    }
                    monVu.addElemento(m);
                }
                return sprite.getElemento();//retorna el producto

            case FANTA: //retorna una bebida de tipo fanta si no manda excepción
                auxBebida = fanta.getElemento();
                if(auxBebida == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este
                    }
                    monVu.addElemento(m);
                }
                return auxBebida;//retorna el producto
                
            case SERRANITA: //retorna un dulce de tipo serranita si no manda excepción
                auxDulces = serranita.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;//retorna el producto

            case SUPER8: //retorna un dulce de tipo calugas si no manda excepción
                auxDulces = super8.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;//retorna el producto
            
            case SNICKERS: //retorna un dulce de tipo oreos si no manda excepción
                auxDulces = snickers.getElemento();
                if(auxDulces == null){
                    for(int i = producto.getCoste(); i<m.getValor(); i+=100){
                        monVu.getElemento();//calculo de vuelto y obtencion de este 
                    }
                    monVu.addElemento(m);
                }
                return auxDulces;//retorna el producto
            
            default: return null;//no retorna nada en caso de que no se escojiera un tipo de producto
        }
    }
/**
 *@author Pablo Villagrán-Lucas Morales1    1
 * @param a se entrega el parametro para ver la cantidad de elementos con los q se llenan los depositos
 */
    public Expendedor(int a) {//se crean los distintos tipos de depositos
        coca = new Deposito<Bebida>();//tipo cocacola
        sprite = new Deposito<Bebida>();//tipo sprite
        fanta = new Deposito<Bebida>();//tipo fanta
        serranita = new Deposito<Dulces>();//tipo serranita
        super8 = new Deposito<Dulces>();//tipo super8
        snickers = new Deposito<Dulces>();//tipo snickers
        monVu = new Deposito<Moneda>();//tipo monedas para el vuelto

        if (a > 0){
            for (int i = 0; i <= a; i++) {//se crean las productos para llenar los depositos
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                Bebida fan = new Fanta(i);
                Dulces ser = new Serranita(i);
                Dulces sni = new Snickers(i);
                Dulces sup = new Super8(i);
                coca.addElemento(coc);//se agregan los productos a sus respectivos depositos
                sprite.addElemento(spi);
                fanta.addElemento(fan);
                serranita.addElemento(ser);
                super8.addElemento(sni);
                snickers.addElemento(sup);
            }
        }
    }
}