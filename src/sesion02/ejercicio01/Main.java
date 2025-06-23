package sesion02.ejercicio01;

// En este caso, la clase Main funciona domo el hilo principal
public class Main {

    public static void main(String[] args) {
        // SI heredamos de Thread
        MiPrimerHilo primerHilo = new MiPrimerHilo();
        // Nota: Ejecutar .start() y no el .run()
        primerHilo.start(); // ejecuta el hilo

        // Si usamos Runnable
        MiSegundoHilo segundoHiloRunnable = new MiSegundoHilo();
        Thread segundoHilo = new Thread(segundoHiloRunnable);
        segundoHilo.start();
    }
}

