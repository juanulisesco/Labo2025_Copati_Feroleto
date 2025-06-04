package Campeonato;
import Clase_3.Fecha;
import Unidad_4.Turnos.Turno;

import java.time.LocalDate;

public class Partido {
    private LocalDate fechaPartido;
    private Turno turno;
    private Equipo local;
    private Equipo visitante;

    public Partido(){
        this.fechaPartido=LocalDate.now();
        this.turno= Turno.MANIANA;
        this.local=new Equipo();
        this.visitante=new Equipo();
    }

    public Partido(LocalDate fechaPartido, Turno turno, Equipo local,
                   Equipo visitante) {
        this.fechaPartido = fechaPartido;
        this.turno = turno;
        this.local = local;
        this.visitante = visitante;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
}
