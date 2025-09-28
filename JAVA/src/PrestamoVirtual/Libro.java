package PrestamoVirtual;
import Persona.Persona;
import java.time.LocalDate;

public class Libro extends Publicacion {
    private boolean saga;

    public Libro(String titulo, Persona autor, int anio, int stock, boolean saga) {
        super(titulo, autor, anio, stock);
        this.saga = saga;
    }

    @Override
    public boolean esPrestable() {
        return true;
    }

    @Override
    public LocalDate calcularFechaDevolucion(LocalDate hoy) {
        return hoy.plusDays(15); // siempre 15 días
    }
}


