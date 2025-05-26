package Sistema_de_almuerzos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private LocalDate fecha;
    private ArrayList<Plato> platos;
    private String solicitante;
    private int horaEntrega;
    private String estadoEntrega;

    public Pedido(LocalDate fecha, Plato platos, String solicitante, int horaEntrega, String estadoEntrega) {
        this.fecha = fecha;
        this.platos=new ArrayList<>();
        this.solicitante= solicitante;
        this.horaEntrega=horaEntrega;
        this.estadoEntrega=estadoEntrega;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public int getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }


}

