package PrestamoVirtual;
import java.util.*;
import java.time.LocalDate;

public class Biblioteca {
    private HashSet<Publicacion> publicaciones;
    private HashSet<Publicacion> prestables;
    private HashSet<Prestamo> prestamos;

    public Biblioteca() {

    }

    public void agregarPublicacion(Publicacion publi) {
        publicaciones.add(publi);
        if (publi.esPrestable()) {
            prestables.add(publi);
        }
    }

    public Publicacion buscarPorTitulo(String nombre) throws NoExistePublicacionException {
        for (Publicacion p : publicaciones) {
            if (p.getTitulo().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new NoExistePublicacionException("No tenemos el libro");
    }

    public void agregarPrestamo(Publicacion publi, Usuario usuario) throws Exception {
        if (!publi.esPrestable())
            throw new NoSePuedePrestarException("No se puede dar a préstamo");

        if (publi.getStock() <= 0)
            throw new NoHayStockException("No hay stock suficiente");

        publi.disminuirStock();
        LocalDate hoy = LocalDate.now();
        LocalDate devolucion = publi.calcularFechaDevolucion(hoy);

        Prestamo prestamo = new Prestamo(publi, usuario, hoy, devolucion);
        prestamos.add(prestamo);

        System.out.println("Préstamo agregado: " + publi.getTitulo() +
                ", devolver antes de: " + devolucion);
    }

}

