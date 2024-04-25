package Tarea.Exepciones;

public class ProductoInexistente extends Exception{
    public ProductoInexistente(){
        System.err.println("No existe ese producto.");
    }
}
