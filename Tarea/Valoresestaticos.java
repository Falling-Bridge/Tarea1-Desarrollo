package Tarea;

public enum Valoresestaticos {

    COCA(500),
    SPRITE(500),
    FANTA(500),
    SERRANITA(500),
    SNICKERS(500),
    SUPER8(500);

    private final int coste;

    public int getCoste() {
        return coste;
    }

    private Valoresestaticos(final int aux){
        coste = aux;
    }
}