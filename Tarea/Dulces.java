package Tarea;

abstract class Dulces {
    private int serie;

    public int getSerie() { 
        return serie;
    }

    public abstract String dulces();

    public Dulces(int a) {
        serie = a;
    }
}

class Serranita extends Dulces{
    public Serranita(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String("serranita");
    }
}

class Calugas extends Dulces{
    public Calugas(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String("calugas");
    }
}

class Oreos extends Dulces{
    public Oreos(int ac) {
        super(ac);
    }

    public String dulces() {
        return new String("oreos");
    }
}