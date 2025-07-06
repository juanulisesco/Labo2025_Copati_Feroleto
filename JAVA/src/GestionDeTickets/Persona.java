package GestionDeTickets;

import java.time.LocalDate;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaN;
    private String direccion;

    public Persona(int dni, String nombre, String apellido,
                   LocalDate fechaN, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.direccion = direccion;
    }

    public Persona() {
        this.dni = 43242834;
        this.nombre = "Ulises";
        this.apellido = "Copati";
        this.fechaN = LocalDate.of(2000, 4, 4);
        this.direccion = "Obispo San Albertaño 2222";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
