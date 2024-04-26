package Tarea.clasedulces;

public class Snickers extends Dulces{
/**
 * cosntructor que define la serie del dulce
 * @author Pablo Villagrán-Lucas Morales
 * @param ac número con el valor de la serie del dulce 
 */
    public Snickers(int ac) {
        super(ac);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase dulce
        return (super.Consumir() + "snicker");
    }
}
