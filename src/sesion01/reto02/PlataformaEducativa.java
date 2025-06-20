package sesion01.reto02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlataformaEducativa {
    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        System.out.println("\uD83D\uDCDA Materiales del curso:");
        for (MaterialCurso mc : lista) {
            mc.mostrarDetalle();
        }
    }

    public static void contarDuracionVideos(List<? extends Video> lista) {
        int minTotales = 0;
        for (Video v : lista) {
            minTotales += v.getMinutos();
        }
        System.out.println("\n\uD83C\uDFA5 Duración total de videos: " + minTotales + " minutos");
    }

    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        for (Object e : lista) {
            ((Ejercicio) e).setRevisado(true);
        }
    }

    // 🚀 Código de desafío opcional: Filtrar materiales por autor
    public static void filtrarPorAutor(List<? extends MaterialCurso> lista, Predicate<MaterialCurso> filtro) {
        System.out.println("\n🔍 Filtrando materiales por autor:");
        for (MaterialCurso material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }

    public static void main(String[] args) {
        List<MaterialCurso> materiales = List.of(
                new Video("Introducción a Java", "Mario", 15),
                new Video("POO en Java", "Carlos", 20),
                new Articulo("Historia de Java", "Ana", 1200),
                new Articulo("Tipos de datos", "Luis", 800),
                new Ejercicio("Variables y tipos", "Luis"),
                new Ejercicio("Condicionales", "Mario")
        );

        mostrarMateriales(materiales);

        List<Video> videos = new ArrayList<>();
        List<Ejercicio> ejercicios = new ArrayList<>();

        for (MaterialCurso v : materiales) {
            if (v instanceof Video) {
                videos.add((Video) v);
            } else if (v instanceof Ejercicio) {
                ejercicios.add((Ejercicio) v);
            }
        }

        contarDuracionVideos(videos);

        marcarEjerciciosRevisados(ejercicios);

        // 🚀 Desafío opcional: Filtrar materiales por autor (ej. Mario)
        filtrarPorAutor(materiales, m -> m.getAutor().equals("Mario"));

    }

}
