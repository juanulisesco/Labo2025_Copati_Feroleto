package PrestamoVirtual;

import Persona.Persona;

import java.time.LocalDate;

public abstract class Publicacion {
    private String titulo;
    private Persona autor;
    private int anio;
    private int stock;

    public Publicacion(String titulo, Persona autor, int anio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.stock = stock;
    }

    public Publicacion(String titulo, int anio, int stock) {
        this.titulo = titulo;
         this.anio = anio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public int getStock() {
        return stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void disminuirStock() {
        stock--;
    }

    public void aumentarStock() {
        stock++;
    }

    public abstract boolean esPrestable();

    public abstract LocalDate calcularFechaDevolucion(LocalDate hoy) throws Exception;

    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + anio + ")";
    }
}
