package sesion01.reto01;

import sesion01.ejemplo01.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionOrdenes {

    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista) {
        System.out.println("\n📋 Órdenes registradas:");
        for (OrdenProduccion orden : lista) {
            orden.mostrarResumen();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional) {
        System.out.println("\n💰 Procesando órdenes personalizadas...");
        for (Object orden : lista) {
            if (orden instanceof OrdenProduccion) {
                OrdenPersonalizada op = (OrdenPersonalizada) orden;
                System.out.println("✅ Orden " + op.getCodigo() + " ajustada con costo adicional de $" + costoAdicional);
            }
        }
    }

    public static void contarOrdenes(List<? extends OrdenProduccion> lista) {
        int totalMasa = 0;
        int totalPerso = 0;
        int totalProto = 0;

        for (OrdenProduccion orden : lista) {
            if (orden instanceof OrdenMasa) {
                totalMasa++;
            } else if (orden instanceof  OrdenPersonalizada) {
                totalPerso++;
            } else if (orden instanceof OrdenPrototipo){
                totalProto++;
            }
        }
        System.out.println("\n\uD83D\uDCCA Resumen total de órdenes: "
                + "\n\uD83D\uDD27 Producción en masa: " + totalMasa
                + "\n\uD83D\uDEE0\uFE0F Personalizadas: " + totalPerso
                + "\n\uD83E\uDDEA Prototipos: " + totalProto);
    }

    /*public static void contarOrdenes(List<? extends OrdenProduccion> lista) {

        long masas = lista.stream().filter(o -> o instanceof OrdenMasa).count();
        long personalizadas = lista.stream().filter(o -> o instanceof OrdenPersonalizada).count();
        long prototipos = lista.stream().filter(o -> o instanceof OrdenPrototipo).count();

        System.out.println("\n📊 Resumen total de órdenes:");
        System.out.println("🔧 Producción en masa: " + masas);
        System.out.println("🛠️ Personalizadas: " + personalizadas);
        System.out.println("🧪 Prototipos: " + prototipos);
    }*/

    public static void main(String[] args) {
        List<OrdenProduccion> todasLasOrdenes = new ArrayList<>();

        List<OrdenMasa> masas = Arrays.asList(
                new OrdenMasa("A123", 500),
                new OrdenMasa("A124", 750)
        );

        List<OrdenPersonalizada> personalizadas = Arrays.asList(
                new OrdenPersonalizada("P456", 100, "ClienteX"),
                new OrdenPersonalizada("P789", 150, "ClienteY")
        );

        List<OrdenPrototipo> prototipos = Arrays.asList(
                new OrdenPrototipo("T789", 10, "Diseño"),
                new OrdenPrototipo("T790", 5, "Pruebas")
        );

        todasLasOrdenes.addAll(masas);
        todasLasOrdenes.addAll(personalizadas);
        todasLasOrdenes.addAll(prototipos);

        mostrarOrdenes(masas);
        mostrarOrdenes(personalizadas);
        mostrarOrdenes(prototipos);

        procesarPersonalizadas(personalizadas, 200);

        contarOrdenes(todasLasOrdenes);
    }
}
