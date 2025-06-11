package Unidad_5.Recetas;

import java.util.ArrayList;

public abstract class Plato extends Sistema{
        private String nombre;
        private Nivel niveles;
        ArrayList<String> pasos;

        public Plato(String nombre, Nivel niveles, ArrayList<String> pasos){
            this.nombre= nombre;
            this.niveles= niveles;
            this.pasos= pasos;
        }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public Nivel getNiveles() {
        return niveles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNiveles(Nivel niveles) {
        this.niveles = niveles;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }
}
