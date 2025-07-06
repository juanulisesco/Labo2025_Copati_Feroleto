package GestionDeTickets;
import java.time.LocalDate;
import java.util.ArrayList;

public class Desarrollador extends Persona {
    private ArrayList<Ticket> tickets;

    public Desarrollador(ArrayList<Ticket> tickets, int dni, String nombre,
                         String apellido, LocalDate fechaN, String direccion) {
        super(dni, nombre, apellido, fechaN, direccion);
        this.tickets= tickets;
    }

    public Desarrollador() {
        super();
        this.tickets= new ArrayList<>();
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
