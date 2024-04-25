package Tarea;

public enum Valoresestaticos {

    COCA(500),
    SPRITE(500),
    PEPSI(500),
    SERRANITA(500),
    CALUGAS(500),
    OREOS(500);

    private final int coste;

    public int getCoste() {
        return coste;
    }

    private Valoresestaticos(final int aux){
        coste = aux;
    }
}