package Campeonato;
import Clase_3.Fecha;
import Unidad_4.Turnos.Turno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Torneo {
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Partido> promedio;
    private LocalDate fechaHoy;

    public Torneo(){
        this.listaEquipos=new ArrayList<>();
        this.promedio= new ArrayList<>();
        this.fechaHoy=LocalDate.now();
    }

    public ArrayList<Equipo> getEquipos() {
        return listaEquipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.listaEquipos = equipos;
    }

    public ArrayList<Partido> getPromedio() {
        return promedio;
    }

    public void setPromedio(ArrayList<Partido> promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(LocalDate fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public void generarP(Equipo equipo1, Equipo equipo2, Turno disponibilidad){
        Partido partido = new Partido(this.fechaHoy, disponibilidad, equipo1, equipo2);
        promedio.add(partido);
    }


    public void emparejarE(ArrayList<Equipo> equipos) {
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                this.generarP(equipos.get(i), equipos.get(j),
                        equipos.get(i).getDisponibilidad());
            }
        }
    }

    public void promediosE() {
        ArrayList<Equipo> manana = new ArrayList<Equipo>();
        ArrayList<Equipo> tarde = new ArrayList<Equipo>();
        ArrayList<Equipo> noche = new ArrayList<Equipo>();

        if (listaEquipos.size() == 0) {
            System.out.println("Falta llenar equipos");
        } else {
            for (Equipo equipo : listaEquipos) {
                Turno disponibilidad = equipo.getDisponibilidad();
                if (disponibilidad == Turno.MANIANA) {
                    manana.add(equipo);
                } else if (disponibilidad == Turno.TARDE) {
                    tarde.add(equipo);
                } else if (disponibilidad == Turno.NOCHE) {
                    noche.add(equipo);
                }
            }
        }

        this.emparejarE(manana);
        this.emparejarE(tarde);
        this.emparejarE(noche);
    }

    public static void main(String[] args) {
        Torneo t1=new Torneo();
        Jugador j1 = new Jugador("Lionel Messi",
                new Fecha(24, 6, 1987), 10, true);
        Jugador j2 = new Jugador("Cristiano Ronaldo",
                new Fecha(5, 2, 1985), 7, false);
        Jugador j3 = new Jugador("Kylian Mbappé",
                new Fecha(20, 12, 1998), 9, false);
        Jugador j4 = new Jugador("Erling Haaland",
                new Fecha(21, 7, 2000), 9, false);
        Jugador j5 = new Jugador("Kevin De Bruyne",
                new Fecha(28, 6, 1991), 17, false);
        Jugador j6 = new Jugador("Neymar Jr",
                new Fecha(5, 2, 1992), 11, false);
        Jugador j7 = new Jugador("Luka Modrić",
                new Fecha(9, 9, 1985), 10, false);
        Jugador j8 = new Jugador("Virgil van Dijk",
                new Fecha(8, 7, 1991), 4, false);
        Jugador j9 = new Jugador("Alisson Becker",
                new Fecha(2, 10, 1992), 1, false);
        Jugador j10 = new Jugador("Jude Bellingham",
                new Fecha(29, 6, 2003), 22, false);
        Jugador j11 = new Jugador("Pedri González",
                new Fecha(25, 11, 2002), 8, false);

        ArrayList<Jugador> J1= new ArrayList<>();
        Collections.addAll(J1,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11);

        Equipo e1 = new Equipo("Atlético Belgrano", "Belgrano", J1,
                Turno.MANIANA);
        Equipo e2 = new Equipo("Defensores de Palermo", "Palermo", J1,
                Turno.TARDE);
        Equipo e3 = new Equipo("Los Tigres de Flores", "Flores", J1,
                Turno.NOCHE);
        Equipo e4 = new Equipo("San Martín FC", "Villa Urquiza", J1,
                Turno.MANIANA);
        Equipo e5 = new Equipo("Huracán del Sur", "Parque Patricios", J1,
                Turno.TARDE);
        Equipo e6 = new Equipo("Villa Real United", "Villa Real", J1,
                Turno.NOCHE);
        Equipo e7 = new Equipo("Estrella de Caballito", "Caballito", J1,
                Turno.MANIANA);
        Equipo e8 = new Equipo("Racing Juniors", "Avellaneda", J1,
                Turno.TARDE);
        Equipo e9 = new Equipo("Boedo City", "Boedo", J1,
                Turno.NOCHE);
        Equipo e10 = new Equipo("La Banda de Colegiales", "Colegiales", J1,
                Turno.MANIANA);
        Equipo e11 = new Equipo("Nueva Chicago Boys", "Mataderos", J1,
                Turno.TARDE);

        Collections.addAll(t1.listaEquipos, e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11);
        t1.promediosE();
    }
}

