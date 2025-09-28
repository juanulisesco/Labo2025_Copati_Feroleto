package PrestamoVirtual;

import Persona.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Libro libro1 = new Libro("El Hobbit", new Persona("John Ronald Reuel", "Tolkien", LocalDate.of(1903, 12,10) ), 1937, 3, true);
        Revista revista1 = new Revista("National Geographic", 2021, 2, "Varios", "NationalG");
        AudioLibro audio1 = new AudioLibro("Aprendiendo Java", new Persona("Autor", "X", LocalDate.of(1903, 12,10) ), 2022, 1, 300, 50.5);

        b.agregarPublicacion(libro1);
        b.agregarPublicacion(revista1);
        b.agregarPublicacion(audio1);

        Usuario usuario1 = new Usuario("Ana", "Gomez", LocalDate.of(1999, 4, 10),
                10000, "ana@mail.com");

        try {
            b.agregarPrestamo(libro1, usuario1);
            b.agregarPrestamo(revista1, usuario1);
            b.agregarPrestamo(audio1, usuario1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


