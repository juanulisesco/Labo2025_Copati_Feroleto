package Masterchef;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Set<String> prohibidos = new HashSet<>();
            prohibidos.add("sal");
            prohibidos.add("pimienta");
            Principiante p1 = new Principiante("Ana", "Lopez", LocalDate.now(), "CABA", Color.ROJO, (HashSet<String>) prohibidos);
            p1.prepararLugar();
            HashMap<String, Integer> ingrEntrada = new HashMap<>();
            ingrEntrada.put("harina", 1);
            p1.cocinar("entrada", ingrEntrada);
            p1.servir("entrada");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}