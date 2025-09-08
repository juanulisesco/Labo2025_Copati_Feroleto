package PartidoPolitico;

import Clase_2.Persona;
import Clase_3.Fecha;

import java.time.LocalTime;

public abstract class Trabajador extends Persona implements Campania{
    private int numCuit;
    private int sueldo;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;

    public Trabajador(String nombre, String apellido, Fecha fechaNacimiento,
                      int dni, String direccion, int numCuit, int sueldo) {
        super(nombre, apellido, fechaNacimiento, dni, direccion);
        this.numCuit = numCuit;
        this.sueldo = sueldo;
    }

    public int getNumCuit() {
        return numCuit;
    }

    public void setNumCuit(int numCuit) {
        this.numCuit = numCuit;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void hacerCampania(String msg) {
        if (horarioInicio.isBefore(LocalTime.now()) && horarioFin.isAfter(LocalTime.now())) {
            System.out.println("Yo" + getNombre() + getApellido() + "te invito a que…" + msg );
        }
    }
}
