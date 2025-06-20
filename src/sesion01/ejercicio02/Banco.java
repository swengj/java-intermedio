package sesion01.ejercicio02;

import java.util.List;

public class Banco {
    public static void verCuentas(List<?> cuentas) {
        for (Object o : cuentas) {
            System.out.println(o);
        }
    }

    // extends: se utiliza para la lectura
                                        // con extends la lista puede ser de CuentaBancaria o de cualquier clase que hereda de ella
    public static void verTitulares(List<? extends CuentaBancaria> cuentas) {
       for (CuentaBancaria o : cuentas) {
           System.out.println(o.getTitular());
       }
    }

    // super se utiliza para la escritura
    // La lista puede ser CuentaDebito o CuentaBancaria (padre)
    public static void depositarCuenta(List<? super CuentaDebito> cuentas) {
        for (Object o : cuentas) {
            if (o instanceof CuentaBancaria) {
                ((CuentaBancaria) o).depositar(100);
            }
        }
    }
}
