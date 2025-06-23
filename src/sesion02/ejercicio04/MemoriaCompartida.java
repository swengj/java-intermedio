package sesion02.ejercicio04;

import java.util.concurrent.locks.ReentrantLock;

public class MemoriaCompartida {
    public static int valor = 0;

    // ReentrantLock
    public static ReentrantLock candado =new ReentrantLock();
}
