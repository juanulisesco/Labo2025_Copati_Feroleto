package GestionDeTickets;

import java.util.ArrayList;

public class Duracion {
    private ArrayList<Ticket> tikets;

    public Duracion(ArrayList<Ticket> tikets) {
        this.tikets = tikets;
    }

    public Duracion() {
        super();
        this.tikets = new ArrayList<>();
    }

    public ArrayList<Ticket> getTikets() {
        return tikets;
    }

    public void setTikets(ArrayList<Ticket> tikets) {
        this.tikets = tikets;
    }

    public void calcularFecha() {
        int año= 0;
        int mes= 0;
        int dia= 0;
        for (Ticket ticket : tikets) {
            año = año + ticket.getFechaF().getYear() - ticket.getFechaC().getYear();
            mes = mes + ticket.getFechaF().getMonthValue() -
                    ticket.getFechaC().getMonthValue();
            dia = dia + ticket.getFechaF().getDayOfMonth() -
                    ticket.getFechaC().getDayOfMonth();
        }
        año = año/tikets.size();
        mes = mes/tikets.size();
        dia = dia/tikets.size();

        System.out.println("El promedio de años es :" + año + "/" + mes + "/" + dia);
    }


}
