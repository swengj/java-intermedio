package sesion02.ejercicio05;

import java.util.concurrent.Callable;

public class Panadero implements Callable<Void> {

    @Override
    public Void call() {

        try {
            // Cada panadero va a calcular cuántos panes puede hacer
            int cantidad = (int) (Math.random() * 5) + 1; // 1 - 5

            System.out.println("👩‍🍳 puede hacer " + cantidad + " panes");

            for (int i = 1; i <= cantidad; i++) {
                // Calculando un índice aleatorio del arreglo "catálogo" (0 - tamaño del arreglo)
                int indice = (int) (Math.random() * Panaderia.catalogo.length);

                String pan = Panaderia.catalogo[indice]; // Cocinando un pan

                // Duerme X milisegundos al hilo de ejecución
                Thread.sleep(500);

                // bloquemos la canasta
                Panaderia.candado.lock();
                try {
                    // Depositamos el pan en la canasta de la panadería
                    // Zona de riesgo
                    Panaderia.canasta.add(pan);
                } finally {
                    Panaderia.candado.unlock();
                }
            }
        } catch (InterruptedException e) {}
        return null;
    }
}
