package sesion01.ejercicio01;

public class CajaMisteriosa<T> {
    private T valor;

    public void guardar(T valor) {
        this.valor = valor;
    }

    public T sacar() {
        return valor;
    }

    public boolean estaVacia() {
        return valor == null;
    }
}
