package Tarea.clasedulces;

public class Super8 extends Dulces{
/**
 * cosntructor que define la serie del dulce
 * @author Pablo Villagrán-Lucas Morales
 * @param ac número con el valor de la serie del dulce 
 */
    public Super8 (int ac) {
        super(ac);
    }

    public String Consumir() {//personaliza el metodo consumir de la clase dulce
        return (super.Consumir() + "super8");
    }
}