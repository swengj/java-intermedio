package sesion01.reto01;

public class OrdenMasa extends OrdenProduccion {

    public OrdenMasa(String codigo, int cantidad) {
        super(codigo, cantidad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("\uD83D\uDD27 OrdenMasa - Código: " + getCodigo() + " - Cantidad: " + getCantidad());
    }
}
