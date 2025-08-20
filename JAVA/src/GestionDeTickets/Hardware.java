/*package GestionDeTickets;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hardware extends Ticket {
    private Dispositivo dispositivo;
    private boolean repuesto;

    public Hardware(int id, Cliente cliente, String desc, LocalDate fechaC,
                    LocalTime horaC, LocalDate fechaF, LocalTime horaF,
                    ArrayList<String> comentarios, Estado estado,
                    Dispositivo dispositivo, boolean repuesto) {
        super(id, cliente, desc, fechaC, horaC, fechaF, horaF, comentarios, estado);
        this.dispositivo = dispositivo;
        this.repuesto = repuesto;
    }

    public Hardware(){
        super();
        this.dispositivo = Dispositivo.CAMARA;
        this.repuesto = false;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public boolean isRepuesto() {
        return repuesto;
    }

    public void setRepuesto(boolean repuesto) {
        this.repuesto = repuesto;
    }

    @Override
    public boolean chequear() {
        if (repuesto == true && getEstado() == Estado.EN_PROCESO) {
            setEstado(Estado.RESUELTO);
            return true;
        }
        else{
            return false;
        }
    }
}
*/