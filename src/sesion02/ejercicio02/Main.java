package sesion02.ejercicio02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Creanado el gestor de hilos con soporte para N hilos simultáneos
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Mandando un hilo a recoger su "pelotita" de las N disponibles
        executorService.submit(new MiTercerHilo());

        // Impedir que mpas hilos entren a la "alberca" (pool)
        executorService.shutdown();

        // Voy a esperar a que todos los hilos herminen
        // Hasta que todos los hilos no terminen, el hilo NO avance
        // Existe la posibilidad de que los hilos se tarden mucho,
        // a lo que vamos a llamar un "Timeout"
        // En este ejemplo, el hilo principal solo va a esperar 10 segundos
        // Si termina el tiempo máximo entonces se lanza una excepción
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println("Se terminó el tiempo de espera");
            System.out.println();
        }
    }
}
