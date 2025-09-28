package PrestamoVirtual;
import Persona.Persona;

import java.time.LocalDate;
import java.util.*;

public class Usuario extends Persona {
    private double credito;
    private String mail;
    private HashSet<Publicacion> leidos;
    private HashMap<Publicacion, Integer> prestamosRealizados;

    public Usuario(String nombre, String apellido, LocalDate fecha_nacimiento, double credito,
                   String mail, HashSet<Publicacion> leidos, HashMap<Publicacion, Integer> prestamosRealizados ) {
        super(nombre, apellido,fecha_nacimiento);
        this.credito = credito;
        this.mail = mail;
        this.leidos = leidos;
        this.prestamosRealizados = prestamosRealizados;
    }
    public Usuario(String nombre, String apellido, LocalDate fecha_nacimiento, double credito,
                   String mail) {
        super(nombre, apellido,fecha_nacimiento);
        this.credito = credito;
        this.mail = mail;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Publicacion> getLeidos() {
        return leidos;
    }

    public void setLeidos(HashSet<Publicacion> leidos) {
        this.leidos = leidos;
    }

    public HashMap<Publicacion, Integer> getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(HashMap<Publicacion, Integer> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public void restarCredito(double monto) {
        credito = credito - monto;
    }

    public void registrarLectura(Publicacion p) {
        leidos.add(p);
    }

    public void registrarPrestamo(Publicacion p) {
        prestamosRealizados.put(p, prestamosRealizados.getOrDefault(p, 0) + 1);
    }
}

