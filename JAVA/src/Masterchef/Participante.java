package Masterchef;
import java.time.LocalDate;
import java.util.*;

public abstract class Participante {
    protected String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String localidad;
    private Color colorEquipo;

    public Participante(String nombre, String apellido, LocalDate fechaNac,
                        String localidad, Color colorEquipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.localidad = localidad;
        this.colorEquipo = colorEquipo;
    }

    public abstract void prepararLugar();
    public abstract void cocinar(String tipo, HashMap<String, Integer> ingredientes) throws Exception;
    public abstract void servir(String tipo);
}

