package Clase_3;

public class Cancion {

    // Atributos
    private String titulo;
    private String autor;

    // Constructor por defecto
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // Constructor parametrizado
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getter para título
    public String getTitulo() {
        return titulo;
    }

    // Setter para título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para autor
    public String getAutor() {
        return autor;
    }

    // Setter para autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void main(String[] args) {
        // Usando el constructor por defecto
        Cancion c1 = new Cancion();
        c1.setTitulo("Yesterday");
        c1.setAutor("The Beatles");
        System.out.println("Título: " + c1.getTitulo() + ", Autor: " + c1.getAutor());

        // Usando el constructor con parámetros
        Cancion c2 = new Cancion("Shape of You", "Ed Sheeran");
        System.out.println("Título: " + c2.getTitulo() + ", Autor: " + c2.getAutor());
    }
}





