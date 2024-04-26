package Tarea.clasebebida;

public class Fanta extends Bebida {
/**
 * cosntructor que define la serie de la bebida
 * @author Pablo Villagrán-Lucas Morales
 * @param ac número con el valor de la serie de la bebida 
 */
    public Fanta(int ap) {
        super(ap);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase bebida
        return (super.Consumir() + "fanta");
    }
}