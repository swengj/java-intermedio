package sesion01.ejercicio01;

public class CajaMisteriosaMain {
    public static void main(String [] args ) {
        CajaMisteriosa<String> cajita = new CajaMisteriosa<>();

        cajita.guardar("Hola Mundo");
        String valor = cajita.sacar();
        System.out.println("El valor de la caja es => " + valor);

        CajaMisteriosa<Integer> cajitaNumeros = new CajaMisteriosa<>();
        cajitaNumeros.guardar(1);
        int valorNumero = cajitaNumeros.sacar();
        System.out.println("El valor de la caja es => " + valorNumero);

    }
}

/*
*   Herencia -> Especialización
*       Animal -> Mamifero -> Canino -> Perro
*                                    -> Lobo
*                          -> Felinos
*                                    -> Gato
*   Polimorfismo -> Generalización
*   Animal a = new Gato();
*
* */
