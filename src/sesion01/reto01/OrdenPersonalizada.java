package sesion01.reto01;

public class OrdenPersonalizada extends OrdenProduccion{
    private String cliente;

    public OrdenPersonalizada(String codigo, int cantidad, String cliente) {
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("\uD83D\uDEE0\uFE0F OrdenPersonalizada - Código: " + getCodigo() + " - Cantidad: " + getCantidad() + " - Cliente: " + cliente);
    }
}
