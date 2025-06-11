package Unidad_5.Recetas;

import java.util.ArrayList;

public class Entrada extends Plato{
    private Temperatura temperaturas;

    public Entrada(String nombre, Nivel niveles, ArrayList<String> pasos, Temperatura temperaturas){
        super(nombre,niveles,pasos);
        this.temperaturas= temperaturas;
    }

    public Temperatura getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(Temperatura temperaturas) {
        this.temperaturas = temperaturas;
    }

}
