package Tarea.Exepciones;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(){
        System.err.println("La compra no se pudo realizar, ya que la moneda no tiene el valor necesario para realizarr la compra");
    }
}