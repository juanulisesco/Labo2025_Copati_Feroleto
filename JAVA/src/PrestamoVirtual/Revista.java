package PrestamoVirtual;
import Persona.Persona;

import java.time.LocalDate;

public class Revista extends Publicacion {
    private String autores;
    private String distribuidora;

    public Revista(String titulo, int anio, int stock, String autores, String distribuidora) {
        super(titulo, anio, stock);
        this.autores= autores;
        this.distribuidora = distribuidora;
    }

    @Override
    public boolean esPrestable() {
        return true;
    }

    @Override
    public LocalDate calcularFechaDevolucion(LocalDate hoy) {
        return getAnio() < 2020 ? hoy.plusDays(10) : hoy.plusDays(3);
    }

}

