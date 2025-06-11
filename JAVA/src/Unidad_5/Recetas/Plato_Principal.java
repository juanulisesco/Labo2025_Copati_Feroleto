package Unidad_5.Recetas;

import java.util.ArrayList;

public class Plato_Principal extends Plato{
    private int tiempo;
    private int comensales;

    public Plato_Principal(String nombre, Nivel niveles, ArrayList<String> pasos, int tiempo, int comensales){
        super(nombre,niveles,pasos);
        this.tiempo= tiempo;
        this.comensales=comensales;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public void instrucciones() {
        System.out.println("Esta receta tarda en cocinarse" + this.tiempo +
                "los pasos son:");
        for (String p : pasos){
            System.out.println(p);
        }
    }
}
