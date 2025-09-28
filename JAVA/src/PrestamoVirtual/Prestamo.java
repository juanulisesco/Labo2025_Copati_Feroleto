package PrestamoVirtual;
import java.time.LocalDate;

public class Prestamo {
    private Publicacion publicacion;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Publicacion publicacion, Usuario usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Publicacion getPublicacion() { return publicacion; }
    public Usuario getUsuario() { return usuario; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
}

