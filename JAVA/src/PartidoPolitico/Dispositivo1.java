package PartidoPolitico;

import Clase_2.Persona;

public class Dispositivo1 {
    private int numSerie;
    private Persona fabricante;
    private String modelo;

    public Dispositivo1(int numSerie, Persona fabricante, String modelo) {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Dispositivo1() {
        this.numSerie = numSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public Persona getFabricante() {
        return fabricante;
    }

    public void setFabricante(Persona fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
