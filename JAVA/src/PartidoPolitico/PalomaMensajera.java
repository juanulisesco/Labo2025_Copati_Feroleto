package PartidoPolitico;

import Alarmas_de_edificio.Dispositivo;

public abstract class PalomaMensajera extends Ave implements Campania {
    private boolean volar ;

    public PalomaMensajera(String color, String nombre, String especie, boolean volar) {
        super(color,nombre,especie);
        this.volar = volar;
    }

    public PalomaMensajera() {
        super();
        this.volar = false;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = true;
    }
}
