package Tarea;

public enum Valoresestaticos {
/**
 * se definen los distintos pruductos y su precio, y en el main se selecciona el producto q se quiere y en el costructor se le asosia su precio
 */
    COCA(100),
    SPRITE(100),
    FANTA(100),
    SERRANITA(100),
    SUPER8(100),
    SNICKERS(100);

    private final int coste;

    public int getCoste() {//getter que retorna coste, q se define en el constructor
        return coste;
    }

    private Valoresestaticos(final int aux){
        coste = aux;
    }
}