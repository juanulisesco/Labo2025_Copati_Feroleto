package Masterchef;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Principiante extends Participante{
    private HashSet<String> prohibidos;

    public Principiante(String nombre, String apellido, LocalDate fechaNac,
                        String localidad, Color colorEquipo, HashSet<String> prohibidos ) {
        super(nombre, apellido, fechaNac, localidad, colorEquipo);
        this.prohibidos = prohibidos;
    }

    @Override
    public void prepararLugar() {
        System.out.println("Ya guarde los prohibidos y no voy a usar: " + prohibidos);
    }

    @Override
    public void cocinar(String tipo, HashMap<String, Integer> ingredientes) throws Exception {
        if (!tipo.equalsIgnoreCase("entrada")) {
            throw new IllegalArgumentException("Principiante solo cocina entradas");
        }

        for (String i : ingredientes.keySet()) {
            if (prohibidos.contains(i)) {
                throw new Exception("Ingrediente prohibido: " + i);
            }
        }
        System.out.println(nombre+ " cocina una entrada.");
    }

    @Override
    public void servir(String tipo) {
        if (!tipo.equalsIgnoreCase("entrada")) {
            throw new IllegalArgumentException("Principiante solo sirve entradas");
        }
        System.out.println(nombre + " sirvió la entrada.");
    }
}
