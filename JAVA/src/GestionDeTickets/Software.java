package GestionDeTickets;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Software extends Ticket {
    private String software;
    private static int cantMaximaIntentos=3;
    private int intentos;
    private boolean parcheAplicable;

    public Software(int id, Cliente cliente, String desc, LocalDate fechaC,
                    LocalTime horaC, LocalDate fechaF, LocalTime horaF,
                    ArrayList<Comentario> comentarios, Estado estado, String software,
                    int intentos, boolean parcheAplicable) {
        super(id, cliente, desc, fechaC, horaC, fechaF, horaF, comentarios, estado);
        this.software = software;
        this.intentos = intentos;
        this.parcheAplicable = parcheAplicable;
    }

    public Software() {
        super();
        this.software = "";
        this.intentos = 0;
        this.parcheAplicable = false;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public static int getCantMaximaIntentos() {
        return cantMaximaIntentos;
    }

    public static void setCantMaximaIntentos(int cantMaximaIntentos) {
        Software.cantMaximaIntentos = cantMaximaIntentos;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isParcheAplicable() {
        return parcheAplicable;
    }

    public void setParcheAplicable(boolean parcheAplicable) {
        this.parcheAplicable = parcheAplicable;
    }

    @Override
    public boolean chequear() {
        if (parcheAplicable== true && intentos < cantMaximaIntentos) {
            if (getEstado()== Estado.EN_PROCESO ){
                setEstado(Estado.RESUELTO);
            }
            return true;
        }
        else {
            return false;
        }
    }
}
