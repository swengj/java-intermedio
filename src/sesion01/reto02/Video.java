package sesion01.reto02;

public class Video extends MaterialCurso {
    private final int minutos;

    public Video(String titulo, String autor, int minutos) {
        super(titulo, autor);
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("\uD83C\uDFA5 Video: " + getTitulo() + " - Autor: " + getAutor() + " - Duración: " + minutos + " min");
    }
}
