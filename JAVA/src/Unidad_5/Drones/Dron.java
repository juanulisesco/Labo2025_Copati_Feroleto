package Unidad_5.Drones;

import Clase_3.Fecha;

import java.util.ArrayList;

public class Dron {
    private String modelo;
    private Fecha adquisicion;
    private Estado_Dron estado;
    private Bateria_Dron bateria;
    private static int contador;
    private double Longitud;
    private double Latitud;

    public Dron(String modelo, Fecha adquisicion, Estado_Dron estado, Bateria_Dron bateria, int contador) {
        this.modelo = modelo;
        this.adquisicion = adquisicion;
        this.estado = estado;
        this.bateria = bateria;
        this.contador= contador + 1;
        this.Latitud= -34.573195;
        this.Longitud= -58.504111;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Fecha getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(Fecha adquisicion) {
        this.adquisicion = adquisicion;
    }

    public Estado_Dron getEstado() {
        return estado;
    }

    public void setEstado(Estado_Dron estado) {
        this.estado = estado;
    }

    public Bateria_Dron getBateria() {
        return bateria;
    }

    public void setBateria(Bateria_Dron bateria) {
        this.bateria = bateria;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setLatitud(double latitud) {
        Latitud = latitud;
    }

    public void setLongitud(double longitud) {
        Longitud = longitud;
    }

    public double getLatitud() {
        return Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void cargarDron(){
        Bateria_Dron[] baterix= bateria.values();
        if (this.bateria.getNum() <= 20){
            this.bateria = Bateria_Dron.CIEN;
        }
        else if (this.bateria.getNum() >= 20){
            for (int i = 0; i < baterix.length; i++) {
                if (baterix[i] == this.bateria){
                    this.bateria= baterix[i + 1];
                }
            }
        }
        System.out.println("Se recargaron las baterias!!!!!!!!");
    }

    public static void main(String[] args) {

    }
}

