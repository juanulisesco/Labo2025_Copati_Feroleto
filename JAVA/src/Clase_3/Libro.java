package Clase_4;
import java.util.Scanner;
import Clase_2.Persona;
import Clase_3.Fecha;
import java.time.LocalDate;

public class Libro {

    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona autor, int isbn, int paginas, String editorial,
                 Fecha fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Libro(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(){
        this.titulo = "Como matar a un ruiseñor" ;
        this.autor = new Persona("Harper Lee", 34,
                "Alabama, Estados Unidos")  ;
        this.isbn = 2 ;
        this.paginas = 75 ;
        this.editorial = "Casa del libro" ;
        this.fechaPublicacion = new Fecha(11, 7,1960);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor.getNombre() + ", " + autor.getEdad() +
                ", " + autor.getDireccion());
        System.out.println("ISBN : " + isbn);
        System.out.println("Paginas : " + paginas);
        System.out.println("Editorial : " + editorial);
        System.out.println("Fecha de Publicacion : " + fechaPublicacion.getDia() +
                ", " + fechaPublicacion.getMes() + ", " + fechaPublicacion.getAnio());
    }

    public void compararCon(Fecha fe2) {
        LocalDate fecha1 = LocalDate.of(fechaPublicacion.getAnio(), fechaPublicacion.getMes(),
                fechaPublicacion.getDia());
        LocalDate fecha2 = LocalDate.of(fe2.getAnio(), fe2.getMes(), fe2.getDia());
        if (fecha1.isBefore(fecha2)) {
            System.out.println("La fecha de publicación es antes que la fecha 2.");
        } else if (fecha1.isAfter(fecha2)) {
            System.out.println("La fecha de publicación es despues que la fecha 2.");
        } else {
            System.out.println("Las dos fechas son iguales.");
        }
    }

    public static void main(String[] args) {
        Persona p1= new Persona("Dan Brown", 60,
                "Nuevo Hampshire, Estados Unidos");
        Persona p2= new Persona(" George Orwell", 46,
                "Motihari, India");
        Fecha f1 = new Fecha(11, 7,1960);
        Libro libro1= new Libro("El Código Da Vinci", p1, 1, 56, "Umbriel Editores", f1);
        Libro libro2 = new Libro("1984", p2 );

        libro1.mostrarInformacion();
        libro1.compararCon(libro2.getFechaPublicacion());

    }
}


