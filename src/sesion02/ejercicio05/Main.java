package sesion02.ejercicio05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // 1. Creamos el "pool" de hilos
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 2. Agregamos los hilos al "pool"
        // Sí creo más de 5 panaderos, solamente 5 de ellos bvan a poder hacer algo al mismo tiempo, los demás deben esperar hasta que uno de ellos libere la "pelotita" en la pool
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());
        executor.submit(new Panadero());

        // 3. Ya no agregamos más
        executor.shutdown();

        // 4. Esperamos a que todos los panaderos terminen
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {}

        // 5. Los panaderos ya terminaron
        System.out.println("Cantidad de panes horneados: " + Panaderia.canasta.size());
    }
}
