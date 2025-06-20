package sesion01.ejemplo01;

public class Main {
    public static void main(String ... args) {
        // 🧺 Almacén de ropa
        Almacen<String> almacenRopa = new Almacen<>();
        System.out.println("¿Almacén de ropa vacío? " + almacenRopa.estaVacio());
        almacenRopa.guardarProductos("Camisa");
        almacenRopa.mostrarTipoProdcuto();

        // 🔢 Almacén de números
        Almacen<Integer> almacenNumeros = new Almacen<>();
        almacenNumeros.guardarProductos(42);
        almacenNumeros.mostrarTipoProdcuto();

        // 🍏 Almacén de alimentos
        Almacen<String> almacenAlimentos = new Almacen<>();
        almacenAlimentos.guardarProductos("Manzana");
        almacenAlimentos.mostrarTipoProdcuto();

        // 🎯 Mostrar productos recuperados
        System.out.println("\n🎯 Productos recuperados:");
        System.out.println("🧺 Ropa: " + almacenRopa.obtenerProducto());
        System.out.println("🔢 Número: " + almacenNumeros.obtenerProducto());
        System.out.println("🍏 Alimento: " + almacenAlimentos.obtenerProducto());
    }
}
