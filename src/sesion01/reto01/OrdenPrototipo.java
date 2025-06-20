package sesion01.reto01;

public class OrdenPrototipo extends OrdenProduccion {

    private String faseDesarrollo;

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo) {
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("\uD83E\uDDEA OrdenPrototipo - Código: " + getCodigo() + " - Cantidad: " + getCantidad() + " - Fase: Diseño: " + faseDesarrollo);
    }
}
