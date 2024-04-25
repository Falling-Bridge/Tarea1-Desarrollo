package Tarea.Exepciones;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        System.err.println("La moneda no puede ser utilisada, ya que no esta correctamente inicializada");
    }
}
