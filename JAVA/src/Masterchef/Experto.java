package Masterchef;
import java.time.LocalDate;
import java.util.HashMap;

public class Experto extends Participante {
    private int tiempo = 80;

    public Experto(String nombre, String apellido, LocalDate fechaNac, String localidad,
                      Color colorEquipo, HashMap<String, Integer> stock) {
        super(nombre, apellido, fechaNac, localidad, colorEquipo);
    }

    @Override
    public void prepararLugar() {
        tiempo -= 5;
        System.out.println("Perdí 5 min, me quedan: " + tiempo);
    }

    @Override
    public void cocinar(String tipo, HashMap<String, Integer> ingredientes) throws Exception {
        if (!tipo.equalsIgnoreCase("entrada") && !tipo.equalsIgnoreCase("principal")) {
            throw new IllegalArgumentException("Experto solo cocina entrada o principal");
        }
        if (tiempo <= 0) {
            throw new TiempoInsException("No queda tiempo");
        }
        tiempo -= 20; // cada plato tarda 20 min aprox
        System.out.println(nombre + " cocina un " + tipo + ". Tiempo restante: " + tiempo);

    }

    @Override
    public void servir(String tipo) {
        if (!tipo.equalsIgnoreCase("entrada") && !tipo.equalsIgnoreCase("principal")) {
            throw new IllegalArgumentException("Experto solo sirve entrada o principal");
        }
        System.out.println(nombre + " sirvió un " + tipo);
    }
}
