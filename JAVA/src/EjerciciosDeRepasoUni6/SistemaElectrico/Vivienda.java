package EjerciciosDeRepasoUni6.SistemaElectrico;

import Clase_2.Persona;

import java.util.HashMap;
import java.util.HashSet;

public abstract class Vivienda {
    private String direccion;
    private Persona dueño;
    private int codigoPostal;
    private HashMap<Integer, HashMap<Meses, Consumo>> pagoConsumo;

    public Vivienda(String direccion, Persona dueño, int codigoPostal, HashMap<Integer, HashMap<Meses, Consumo>> pagoConsumo) {
        this.direccion = direccion;
        this.dueño = dueño;
        this.codigoPostal = codigoPostal;
        this.pagoConsumo = pagoConsumo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public HashMap<Integer, HashMap<Meses, Consumo>> getPagoConsumo() {
        return pagoConsumo;
    }

    public void setPagoConsumo(HashMap<Integer, HashMap<Meses, Consumo>> pagoConsumo) {
        this.pagoConsumo = pagoConsumo;
    }

    public abstract int calculoConsumoMes(Meses mes, int anio);
}
