package Masterchef;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante {
    private HashMap<String, Integer> stock;

    public Intermedio(String nombre, String apellido, LocalDate fechaNac, String localidad,
                      Color colorEquipo, HashMap<String, Integer> stock) {
        super(nombre, apellido, fechaNac, localidad, colorEquipo);
        this.stock = stock;
    }

    @Override
    public void prepararLugar() {
        System.out.print("Mi stock a usar es: ");
        for (String i : stock.keySet()) {
            if (stock.get(i) > 1) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    @Override
    public void cocinar(String tipo, HashMap<String, Integer> ingredientes) throws Exception {
        if (!tipo.equalsIgnoreCase("principal")) {
            throw new IllegalArgumentException("Intermedio solo cocina principales");
        }
        for (String ing : ingredientes.keySet()) {
            int cant = ingredientes.get(ing);
            if (!stock.containsKey(ing) || stock.get(ing) < cant) {
                throw new StockException("No alcanza de: " + ing);
            }
        }
        System.out.println(nombre + " cocina un principal.");
    }

    @Override
    public void servir(String tipo) {
        if (!tipo.equalsIgnoreCase("principal")) {
            throw new IllegalArgumentException("Intermedio solo sirve principales");
        }
        System.out.println(nombre + " sirvió el principal.");
    }
}

