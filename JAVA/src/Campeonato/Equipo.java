package Campeonato;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String barrioProcedencia;
    private ArrayList<Jugador> jugadores;
    private char disponibilidad;

    public Equipo() {
        this.nombre="Milano";
        this.barrioProcedencia="Villa Pueyrredon";
        this.jugadores=new ArrayList<>();
        this.disponibilidad='M';
    }

    public Equipo(String nombre, String barrioProcedencia, ArrayList<Jugador> jugadores,
                  char disponibilidad) {
        this.nombre = nombre;
        this.barrioProcedencia = barrioProcedencia;
        this.jugadores = jugadores;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrioProcedencia() {
        return barrioProcedencia;
    }

    public void setBarrioProcedencia(String barrioProcedencia) {
        this.barrioProcedencia = barrioProcedencia;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public char getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
