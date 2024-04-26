package Tarea.clasemoneda;

public abstract class Moneda {
    public Moneda getSerie() {//retorna la instancia del la moneda
        return this;
    }

    public abstract int getValor();//metodo que se perzonaliza para cada tipo de moneda

    public Moneda() {}//el constructor de esta clase no hace nada, ya que moneda es unicamente utilizada por su valor
}