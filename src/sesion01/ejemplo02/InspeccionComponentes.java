package sesion01.ejemplo02;

import java.util.List;

public class InspeccionComponentes {

    // Método flexible: acepta cualquier tipo que sea Componente o subclase de Componente
    public static void  imprimirComponentes(List<? extends Componente> componentes) {
        for (Componente c : componentes) {
            System.out.println("🔍 Inspeccionando componente: " + c.getNombre());
        }
    }

    public static void main(String[] args) {
        List<Motor> motores = List.of(new Motor("Motor Falcon 9"), new Motor("Motor Rapter"));
        List<Ala> alas = List.of(new Ala("Ala Delta"), new Ala("Ala Supersónica"));

        // ✅ Método acepta ambos tipos gracias a la wildcard con extends
        imprimirComponentes(motores);
        imprimirComponentes(alas);
    }
}
