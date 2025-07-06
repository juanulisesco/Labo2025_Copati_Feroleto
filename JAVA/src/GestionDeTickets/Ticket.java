package GestionDeTickets;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Ticket {
    private int id;
    private Cliente cliente;
    private String desc;
    private LocalDate fechaC;
    private LocalTime horaC;
    private LocalDate fechaF;
    private LocalTime horaF;
    private ArrayList<Comentario> comentarios;
    private Estado estado;

    public Ticket(int id, Cliente cliente, String desc, LocalDate fechaC, LocalTime horaC,
                  LocalDate fechaF, LocalTime horaF, ArrayList<Comentario> comentarios,
                  Estado estado) {
        this.id = id;
        this.cliente = cliente;
        this.desc = desc;
        this.fechaC = fechaC;
        this.horaC = horaC;
        this.fechaF = fechaF;
        this.horaF = horaF;
        this.comentarios = comentarios;
        this.estado = estado;
    }

    public Ticket() {
        this.id = 0;
        this.cliente = new Cliente(124444, "pappa", "pizzeria",
                LocalDate.of(1999, 12,21),
                "Condarco 2122");
        this.desc = "";
        this.fechaC = LocalDate.of(1990, 1, 1);
        this.horaC = LocalTime.of(10, 5);
        this.fechaF = LocalDate.now();
        this.horaF = LocalTime.now();
        this.comentarios = new ArrayList<>();
        this.estado = Estado.ABIERTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getFechaC() {
        return fechaC;
    }

    public void setFechaC(LocalDate fechaC) {
        this.fechaC = fechaC;
    }

    public LocalTime getHoraC() {
        return horaC;
    }

    public void setHoraC(LocalTime horaC) {
        this.horaC = horaC;
    }

    public LocalDate getFechaF() {
        return fechaF;
    }

    public void setFechaF(LocalDate fechaF) {
        this.fechaF = fechaF;
    }

    public LocalTime getHoraF() {
        return horaF;
    }

    public void setHoraF(LocalTime horaF) {
        this.horaF = horaF;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public abstract boolean chequear();

}
