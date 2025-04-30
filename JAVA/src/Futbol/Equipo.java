package Futbol;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private char disponibilidad;

    public Equipo() {
        this.nombre = "Milano";
        this.barrio = "Villa Urquiza";
        this.jugadores = new ArrayList<>();
        this.disponibilidad='M';
    }
    public Equipo(String nombre, String barrio, ArrayList<Jugador> jugadores,
                  char disponibilidad ) {
        this.nombre = nombre ;
        this.barrio = barrio ;
        this.jugadores = new ArrayList<>();
        this.disponibilidad= disponibilidad ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
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
