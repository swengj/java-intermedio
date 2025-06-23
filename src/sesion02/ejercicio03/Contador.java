package sesion02.ejercicio03;

public class Contador {

    private int valor = 0;

    // Nota: sincronized solo funciona cuando lo compartido es un objeto
    public synchronized void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return valor;
    }
}
