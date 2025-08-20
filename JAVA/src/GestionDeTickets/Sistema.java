/*package GestionDeTickets;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Ticket> tikets;
    private ArrayList<Desarrollador> desarrolladores;

    public Sistema() {
        this.tikets = new ArrayList<>();
        this.desarrolladores = new ArrayList<>();
    }

    public Sistema(ArrayList<Ticket> tikets, ArrayList<Desarrollador> desarrolladores) {
        this.tikets = tikets;
        this.desarrolladores = desarrolladores;
    }

    public ArrayList<Ticket> getTikets() {
        return tikets;
    }

    public void setTikets(ArrayList<Ticket> tikets) {
        this.tikets = tikets;
    }

    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public int cantidadT(Estado estado){
        int cantidad = 0;
        for(Ticket ticket : tikets){
            if(ticket.getEstado().equals(estado)){
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadTT() {
        int cantidad = 0;
        for(Ticket ticket : tikets){
            cantidad++;
        }
        return cantidad;
    }

    public int ticketMasAntiguo(Estado estado){
        int idF= 0;
        LocalDate fecha = LocalDate.now();
        for(Ticket ticket : tikets){
            if(ticket.getEstado().isBefore(Estado.ABIERTO)){
                if (ticket.getFechaC().equals(fecha)){
                    fecha = ticket.getFechaC();
                    idF= ticket.getId();
                }
            }
        }
        return idF;
    }

    public Desarrollador masT(){
        Desarrollador desarrollador = new Desarrollador();
        for(Desarrollador desarrollador1 : desarrolladores){
            if(desarrollador.getTickets().size()>desarrollador1.getTickets().size()){
                desarrollador = desarrollador1;
            }
        }
        return desarrollador;
    }

    public Desarrollador masV(){
        Desarrollador desarrollador = new Desarrollador();
        for(Desarrollador desarrollador1 : desarrolladores){
            if(desarrollador.getFechaN().isAfter(desarrollador1.getFechaN())){
                desarrollador = desarrollador1;
            }
        }
        return desarrollador;
    }

    public Desarrollador determinado(Ticket ticket){
        Desarrollador desarrollador = new Desarrollador();
        for(Desarrollador desarrollador1 : desarrolladores){
            for(Ticket tickets: desarrollador1.getTickets()){
                if (ticket == tickets){
                    return desarrollador1;
                }
            }
        }
        return desarrollador;
    }
}
*/