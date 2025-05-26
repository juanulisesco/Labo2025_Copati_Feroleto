package Sistema_de_almuerzos;

import Clase_2.Persona;

public class Profesor extends Persona {
    private int porcentajeDesc;

    public Profesor(int porcentajeDesc){
        super();
        this.porcentajeDesc=porcentajeDesc;
    }

    public int getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }
}
