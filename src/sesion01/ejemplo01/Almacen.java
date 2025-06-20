package sesion01.ejemplo01;

public class Almacen<T> {

    private T producto;

    // Guarda un producto de cualquier tipo
    public void guardarProductos(T producto) {
        this.producto = producto;
        System.out.println("📦 Producto guardado: " + producto);
    }

    // Devuelve el producto almacenado
    public T obtenerProducto() {
        return producto;
    }

    // Verifica si el almacén está vacío
    public boolean estaVacio() {
        return producto == null;
    }

    public void mostrarTipoProdcuto() {
        if (producto != null) {
            System.out.println("🔍 Tipo de producto almacenado: " + producto.getClass().getSimpleName());
        } else {
            System.out.println("🚫 El almacén está vacío.");
        }
    }

}
