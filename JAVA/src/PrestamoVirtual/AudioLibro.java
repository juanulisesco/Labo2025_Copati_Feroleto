package PrestamoVirtual;
import Persona.Persona;

public class AudioLibro extends Publicacion {
    private int duracion;
    private double pesoArchivo;

    public AudioLibro(String titulo, Persona autor, int anio, int stock, int duracion, double pesoArchivo) {
        super(titulo, autor, anio, stock);
        this.duracion = duracion;
        this.pesoArchivo = pesoArchivo;
    }

    @Override
    public boolean esPrestable() { return false; }
}

