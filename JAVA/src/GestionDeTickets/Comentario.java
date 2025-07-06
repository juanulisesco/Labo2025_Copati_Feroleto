package GestionDeTickets;

public class Comentario {
    private String anotaciones;

    public Comentario(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public Comentario() {
        this.anotaciones = "";
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
}
