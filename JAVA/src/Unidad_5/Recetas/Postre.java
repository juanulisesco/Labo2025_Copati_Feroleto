package Unidad_5.Recetas;

import java.util.ArrayList;

public class Postre extends Plato{
    private boolean apto;
    private Temperatura temperaturas;

    public Postre(String nombre, Nivel niveles, ArrayList<String> pasos, boolean apto, Temperatura temperatura){
        super(nombre,niveles,pasos);
        this.apto= apto;
        this.temperaturas= temperatura;
    }

    public boolean isApto() {
        return apto;
    }

    public Temperatura getTemperatura() {
        return temperaturas;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperaturas = temperaturas;
    }
}
