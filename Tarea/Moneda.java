package Tarea;

abstract class Moneda {
    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public Moneda() {
    }
}

class Moneda1500 extends Moneda {
    public int getValor() {
        return 1500;
    }

    public Moneda1500() {
        super();
    }
}

class Moneda1000 extends Moneda {
    public int getValor() {
        return 1000;
    }

    public Moneda1000() {
        super();
    }
}

class Moneda500 extends Moneda {
    public int getValor() {
        return 500;
    }

    public Moneda500() {
        super();
    }
}

class Moneda100 extends Moneda {
    public int getValor() {
        return 100;
    }

    public Moneda100() {
        super();
    }
}