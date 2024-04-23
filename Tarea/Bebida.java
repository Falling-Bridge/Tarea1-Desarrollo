package Tarea;

abstract class Bebida {
    private int serie;

    public int getSerie() { 
        return serie;
    }

    public abstract String beber();

    public Bebida(int a) {
        serie = a;
    }
}

class CocaCola extends Bebida {
    public CocaCola(int ac) {
        super(ac);
    }

    public String beber() {
        return new String("cocacola");
    }
}

class Sprite extends Bebida {
    public Sprite(int ab) {
        super(ab);
    }

    public String beber() {
        return new String("sprite");
    }
}


